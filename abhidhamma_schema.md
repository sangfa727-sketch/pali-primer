# Abhidhamma Content JSON — Schema Reference

## Source
- Extracted from: `org.dhammadarna.abhidhamma_myanmar` v1.2 (Nov 2019 build)
- Original storage: Android `resources.arsc` (string + string-array resources)
- Language: Burmese (Myanmar Unicode, U+1000–U+109F)
- Total content: ~420,000 Burmese characters

## Top-level Structure

```json
{
  "meta": { ... },
  "strings": { "<key>": "<value>", ... },
  "arrays":  { "<key>": ["<item0>", "<item1>", ...], ... }
}
```

## `meta` object
Metadata only. Do not display to end users.
- `package` — original Android package name
- `version` — original app version
- `strings_count` — 512
- `arrays_count` — 705
- `total_array_items` — 5,398

## `strings` object (512 entries)
Short UI labels and titles. Values are typically < 100 characters.

**Key naming convention:**
- `wf_*` — wayfinding/navigation labels (chapter names shown in the menu tree)
- `app_name`, `menu_*` — app-level UI strings
- Others — button labels, dialog titles, misc UI

**Examples:**
```json
"wf_abhidhamma": "အဘိဓမ္မာ",
"wf_s0_introduction": "နိဒါန်း",
"wf_sate": "စိတ်ပိုင်း",
"wf_satetathate": "စေတသိက်ပိုင်း",
"wf_kamawasayar": "ကာမာဝစရစိတ်",
"app_name": "Abhidhamma"
```

## `arrays` object (705 arrays, 5,398 total items)
The actual Abhidhamma teaching content. Each array is one topic/chapter and contains
2–20+ paragraphs of Burmese text (some paragraphs are > 1000 characters).

**Array-item conventions (verified by content analysis):**
Most arrays follow a header-body alternation pattern where odd indices are section
titles and even indices (after index 0) are the corresponding body paragraphs:

- `[0]` — usually the chapter/topic title (short)
- `[1]` — first section body (long paragraph)
- `[2]` — second section title (short)
- `[3]` — second section body (long paragraph)
- ...continuing in title/body pairs

**Not every array follows this exactly** — some are pure lists (e.g. tables of
citta counts, sequential enumerations). When rendering, check length: items > 50
chars are almost always body content; items < 30 chars are almost always titles.

**Example — array `s0_panama_objective`:**
```json
"s0_panama_objective": [
  "ပဏာမ",
  "ဘုရားဂုဏ်၊ တရားဂုဏ်၊ သံဃာ့ဂုဏ်ကို ရှိခိုးပူဇော်သည်။\n\nဘုရားဂုဏ်\n(၁) သီလစသော ...",
  "ပဋိညာဉ်",
  "(၁) အန္တရာယ်ကင်းရှင်းစေရန်နှင့် \n(၂) မိမိရေးသားမည့် ကျမ်းစာ အဆုံးတိုင် ..."
]
```

## Key-name Cross-referencing (IMPORTANT)

Array keys and `wf_*` string keys often share naming patterns. This is useful for investigation, but it is **not proof of the original runtime relationship**. A matching suffix, prefix, position, or similar text must not be promoted to an exact navigation mapping without supporting resource/runtime evidence. If the relationship is not proven, record it as `PARTIAL` or `UNRESOLVED`.

**Example pair:**
- `strings["wf_s0_panama_objective"]` = `"ပဏာမနှင့် ပဋိညာဉ်"` — menu label
- `arrays["s0_panama_objective"]` — the content shown when that menu item is tapped

**Prefix conventions:**
- `s0_*` — Section 0 (Introduction / နိဒါန်း)
- Content-family prefixes seen: `abhidhamma_`, `lawba_`, `dawtha_`, `mawha_`,
  `akutho_`, `ahate_`, `mahar_`, `kama_`, `yupar_`, `ayupar_`, `lawkotetayar_`,
  and many more — each corresponds to a category in the Abhidhamma taxonomy
- Suffixes: `_title`, `_analysis`, `_analysis_detail`, `_mm` (Myanmar note),
  `ind_*` (index/summary)

## Recommended Data Model for Integration

If the target app uses SQLite / Room / Isar / sqflite:

```
Table: abhidhamma_topics
  - key TEXT PRIMARY KEY
  - menu_label TEXT
  - parent_key TEXT (nullable)    -- only when evidence-backed
  - order_index INTEGER (nullable)
  - verification_state TEXT       -- EXACT | PARTIAL | UNRESOLVED
  - source_reference TEXT

Table: abhidhamma_paragraphs
  - id INTEGER PRIMARY KEY AUTOINCREMENT
  - topic_key TEXT (FK → topics.key)
  - position INTEGER              -- original array index (0-based)
  - content_role TEXT (nullable)  -- heading | body | list | table | note | analysis | unknown
  - text TEXT                     -- raw source content, unchanged
```

`parent_key` must not be derived from a key prefix alone. Paragraph roles must not be inferred solely from text length or position when exact source/runtime evidence is required.

## Evidence Rules
1. Preserve every original array key and item order.
2. Preserve duplicate-looking arrays and variants; never deduplicate by text.
3. Never silently correct spelling, punctuation, numbering, Unicode, or line breaks.
4. Treat key similarity, item length, position, and prefix conventions as investigation heuristics only.
5. A relationship is `EXACT` only when supported by surviving source/resource/runtime evidence.
6. If evidence is insufficient, use `PARTIAL` or `UNRESOLVED` rather than guessing.

## Rendering Notes
1. Font: use Noto Sans Myanmar or a similar Unicode Myanmar font. Do NOT use
   Zawgyi rendering — content is Unicode.
2. Paragraph text contains literal `\n` for line breaks. Render as newlines.
3. Some paragraphs contain nested numbering like `(၁) ... (၂) ...` in Burmese
   digits. Preserve verbatim.
4. Very long paragraphs (1000+ chars) exist — plan for scroll containers.
