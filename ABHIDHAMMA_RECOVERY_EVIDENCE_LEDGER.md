# Abhidhamma Recovery — Evidence Ledger

## Purpose

Execution checkpoint for recovering the original Abhidhamma application before Pali Primer integration. Source-proven facts are separated from relationships that still require proof.

## Priority order

1. Preserve original source identity and content.
2. Complete section mapping.
3. Complete the 492-entry navigation matrix.
4. Freeze evidence-backed parent/child structure.
5. Recover runtime behavior where binary decoding permits.
6. Only then bind the canonical structure into Pali Primer.

## Source-proven facts

| Evidence | Result | State |
|---|---|---|
| `resources.arsc` | 512 strings, 705 arrays, 5,398 items | EXACT |
| `abhidhamma_content.min.json` | Recovered source content artifact | EXACT |
| `wf_*` inventory | 492 navigation labels | EXACT |
| Section prefixes | s0–s9 plus shared/other | EXACT |
| AndroidManifest.xml | package `org.dhammadarna.abhidhamma_myanmar`, version 1.2, launcher `IndexActivityWithTitleBar` | EXACT |
| activity_main.xml | Original compiled menu contains **2 item elements**; each has id/icon/orderInCategory/showAsAction/title attributes; title resource IDs are **0x7f0501ef** and **0x7f0501f0** | EXACT |
| main_start_view.xml | Main list/expandable-list rendering layer | EXACT |
| main_start_view_listitem.xml | Main list item rendering layer | EXACT |
| detail_start_view.xml | Detail rendering layer | EXACT |
| detail_start_view_listitem.xml | Detail item rendering layer | EXACT |
| Abhidhamma.apk | Original APK exists; SHA `f28bbc62ec62c39a8194157db207817c9a3ced20` | EXACT |
| classes.dex | Original DEX exists; SHA `12767bbc1d80d7ddfa88071c6eda694ea8fc88e7` | EXACT |

## Section Mapping — target 100%

Already strong:
- s0–s9 inventory established.
- Major topic families mapped.
- s8 24-Paccaya order source-confirmed.
- s9 major meditation/Vipassana families mapped.

Remaining:
- reconcile shared/other arrays with section navigation;
- resolve labels without a proven one-to-one array key;
- separate source-confirmed relationships from prefix-based investigation.

## Navigation Mapping — target 100%

Every one of the 492 `wf_*` labels must record:
- original key and label;
- source order when recoverable;
- matching array when proven;
- shared-array reuse when proven;
- verification state: EXACT/PARTIAL/UNRESOLVED.

No guessed mapping is permitted.

### Newly verified menu-resource evidence

The compiled `activity_main.xml` was decoded at the binary-XML structure level:
- exactly **2** `item` nodes are present;
- both item nodes contain the standard Android attributes `id`, `icon`, `orderInCategory`, `showAsAction`, and `title`;
- their title attributes reference resource IDs `0x7f0501ef` and `0x7f0501f0`;
- the menu resource itself does **not** contain literal Burmese menu titles in its string pool, so the titles must be resolved through `resources.arsc`;
- therefore the two menu entries are now structurally EXACT, but their semantic labels/dispatch targets remain PARTIAL until the resource table/runtime evidence resolves them.

## Master Structure — target 100%

Required:
- section → topic → content-node relationships;
- primary/child/analysis/note/example/table roles;
- source order;
- original array-key traceability;
- verification state on every relationship.

## Runtime/UI Logic — evidence-backed reconstruction

Current proven architecture:

```text
IndexActivityWithTitleBar
  ├─ activity_main.xml
  ├─ main_start_view.xml
  │   └─ main_start_view_listitem.xml
  └─ detail_start_view.xml
      └─ detail_start_view_listitem.xml
```

Still unproven at method level:
- exact menu-to-section dispatch;
- exact parent/child expansion rules;
- topic-to-array dispatch;
- next/previous behavior;
- shared-resource runtime usage;
- complete back-stack behavior.

## Binary decoding blocker

The APK and DEX are present in the recovery branch, but the available GitHub connector does not expose usable binary bytes for local DEX/APK decoding. This is a tooling/access limitation, not evidence that the original binary is missing.

Until usable binary decoder input is available, runtime-derived relationships remain PARTIAL or UNRESOLVED.

## Integration gate

Pali Primer Abhidhamma integration must use a canonical mapping package containing:
- original array key;
- original item order;
- navigation key/label;
- section;
- parent/child relationship;
- content role;
- verification state;
- source hash/reference.

The integration layer must never silently substitute external Abhidhamma text.

## Completion rule

Recovery reaches 100% only when:
1. all 705 arrays are accounted for;
2. all 492 navigation labels are accounted for;
3. every relationship is EXACT or explicitly UNRESOLVED;
4. hierarchy is evidence-backed;
5. runtime behavior is verified where recoverable;
6. the canonical structure is frozen and traceable to the original artifacts.
