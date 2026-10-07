# Abhidhamma Recovery Audit — 2026-10-07

## Evidence-pass result

This pass used the recovered Git blob for `abhidhamma_content.min.json` rather than inferred text.

### Source inventory

| Metric | Verified |
|---|---:|
| Original strings | **512** |
| Original arrays | **705** |
| Total array items | **5,398** |
| Original `wf_*` labels | **492** |
| Source artifact SHA-1 | `64181dd75f31186216f6276351d793511ba78922` |

### Section inventory

| Section | Arrays | Items | State |
|---|---:|---:|---|
| s0 — နိဒါန်း | 6 | 28 | EXACT inventory |
| s1 — စိတ်ပိုင်း | 1 | 16 | EXACT inventory |
| s2 — စေတသိက်ပိုင်း | 33 | 282 | EXACT inventory |
| s3 — ပကိဏ်းပိုင်း | 39 | 370 | EXACT inventory |
| s4 — ဝီထိပိုင်း | 203 | 1,380 | EXACT inventory |
| s5 — ဝီထိမုတ်ပိုင်း | 81 | 654 | EXACT inventory |
| s6 — ရုပ်ပိုင်း | 60 | 398 | EXACT inventory |
| s7 — သမုစ္စည်းပိုင်း | 47 | 504 | EXACT inventory |
| s8 — ပစ္စည်းပိုင်း | 90 | 592 | EXACT inventory |
| s9 — ကမ္မဋ္ဌာန်းပိုင်း | 71 | 554 | EXACT inventory |
| shared/other | 74 | 620 | EXACT inventory |
| **TOTAL** | **705** | **5,398** | **ACCOUNTED** |

### Navigation evidence pass

All **492/492** `wf_*` labels now have an explicit matrix record in `ABHIDHAMMA_NAVIGATION_MATRIX.md`.

- **112 EXACT** — `wf_` key removal produces an existing original array key.
- **292 PARTIAL** — original navigation label text matches one or more recovered array items, but runtime dispatch is not proven.
- **88 UNRESOLVED** — no direct key/label-to-array relationship is established from the accessible source artifact.

### What this closes

- [x] 705 arrays accounted for.
- [x] 5,398 array items accounted for.
- [x] 492 navigation labels accounted for.
- [x] Source order of the 492 labels preserved from the recovered string object.
- [x] Original keys and duplicate/variant identities preserved.
- [x] No external Abhidhamma text added.
- [x] No guessed relationship promoted to EXACT.

### What still prevents honest 100% runtime recovery

The remaining gap is **evidence of behavior**, not missing source inventory:

1. exact menu-item title → resource ID → dispatch target;
2. exact section parent/child expansion;
3. exact navigation-to-array dispatch for PARTIAL/UNRESOLVED entries;
4. shared-array reuse at runtime;
5. detail rendering behavior;
6. back/next behavior;
7. complete runtime hierarchy.

The original `Abhidhamma.apk` and `classes.dex` are present and their SHA-1 identities are known, but the current GitHub connector cannot return their binary bytes for local DEX/APK decoding.

## 100% rule

For this project, **source recovery/accounting can be 100% while runtime reconstruction remains below 100%**. We will not convert the latter into a false 100% by inference.

The next decisive evidence is a locally decodable copy of the original APK or `classes.dex`. Once available, reconcile the 492-record matrix against runtime resource IDs and navigation methods, then freeze the canonical Master Structure.

## Current safe state

**Source/data recovery: 100% accounted.**

**Navigation inventory: 100% accounted.**

**Exact runtime hierarchy: NOT YET 100%.**

This audit is evidence-backed and does not modify the recovered source content.
