# Abhidhamma Recovery — Evidence Ledger

## Purpose

This ledger is the execution checkpoint for recovering the original Abhidhamma application before Pali Primer integration. It distinguishes source-proven facts from relationships that still require proof.

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
| activity_main.xml | Original menu resource with item/id/icon/order/title attributes | EXACT |
| main_start_view.xml | Main list/expandable-list rendering layer | EXACT |
| main_start_view_listitem.xml | Main list item rendering layer | EXACT |
| detail_start_view.xml | Detail rendering layer | EXACT |
| detail_start_view_listitem.xml | Detail item rendering layer | EXACT |
| Abhidhamma.apk | Original APK artifact exists; SHA `f28bbc62ec62c39a8194157db207817c9a3ced20` | EXACT |
| classes.dex | Original DEX exists; SHA `12767bbc1d80d7ddfa88071c6eda694ea8fc88e7` | EXACT |

## Current relationship status

### Section Mapping

Target: 100%.

Already strong:
- s0–s9 inventory is established.
- Major topic families are mapped.
- s8 24-Paccaya order is source-confirmed.
- s9 major meditation/Vipassana families are mapped.

Remaining:
- reconcile shared/other arrays with section navigation;
- resolve labels that do not have a one-to-one key match;
- distinguish source-confirmed relationships from prefix-based investigation.

### Navigation Mapping

Target: 100%.

Required for every one of the 492 `wf_*` labels:
- original key;
- original label;
- source order when recoverable;
- matching array when proven;
- shared-array reuse when proven;
- verification state: EXACT/PARTIAL/UNRESOLVED.

No guessed mapping is permitted.

### Master Structure

Target: 100%.

Required:
- section → topic → content-node relationships;
- primary/child/analysis/note/example/table roles;
- source order;
- original array key traceability;
- verification state on every relationship.

### Runtime/UI Logic

Target: evidence-backed reconstruction.

Current proven architecture:
```
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

Until a usable binary decoder input is available, runtime-derived relationships must remain PARTIAL or UNRESOLVED.

## Integration gate

Pali Primer Abhidhamma integration should use a canonical mapping package with:

- original array key;
- original item order;
- navigation key/label;
- section;
- parent/child relationship;
- content role;
- verification state;
- source hash/reference.

The integration layer must never silently substitute external Abhidhamma text.

## Current decision

Do not stop recovery merely because Original Data is 100%. Continue the highest-value structural work first. UI/UX implementation is secondary until the canonical structure is frozen.

## Completion rule

Recovery reaches 100% only when:
1. all 705 arrays are accounted for;
2. all 492 navigation labels are accounted for;
3. every relationship is EXACT or explicitly UNRESOLVED;
4. hierarchy is evidence-backed;
5. runtime behavior is verified where recoverable;
6. the canonical structure is frozen and traceable to the original artifacts.
