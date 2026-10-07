# Original Abhidhamma Recovery — Remaining Work

## Completed gates

- [x] Original package/version identified
- [x] resources.arsc content extracted
- [x] 512 strings recovered
- [x] 705 arrays recovered
- [x] 5,398 array items accounted for
- [x] 492 wf_* navigation labels identified
- [x] s0–s9 section inventory established
- [x] Shared/other resource family identified
- [x] Major section/topic families mapped
- [x] 24 Paccaya navigation order source-confirmed
- [x] Source-preservation rule established
- [x] Duplicate/variant arrays intentionally preserved
- [x] Master Structure model documented

## Remaining gates

### Gate 1 — Complete navigation-to-array matrix

For every wf_* entry:
1. identify its exact menu label;
2. identify the matching content array, if one exists;
3. identify shared-array usage, if applicable;
4. record original order;
5. assign EXACT, PARTIAL, or UNRESOLVED.

Do not manufacture an array mapping when no source relationship is proven.

### Gate 2 — Exact parent/child hierarchy

Build the canonical tree from evidence rather than key-name assumptions.

Required evidence sources:
- resources.arsc
- original layouts/resources
- decoded classes.dex navigation logic
- runtime inspection of the original application where available

### Gate 3 — Decode original classes.dex

Current blocker:

The original `classes.dex` is confirmed in `sangfa727-sketch/Abhidhamma`, and `Abhidhamma.apk` is also present in the Pali Primer recovery branch. The available GitHub connector can retrieve their metadata but cannot return usable binary bytes for decoding because these artifacts are not UTF-8 text. A local decoder therefore still needs a usable APK/DEX binary input.

Until it is decoded, runtime navigation relationships remain partially verified.

### Gate 4 — Original UI/runtime verification

Verify:
- menu opening sequence;
- section expansion/collapse;
- topic selection;
- content rendering;
- next/previous navigation where present;
- notes/analysis/table rendering;
- shared-resource behavior;
- back navigation.

This gate is for verification only. It must not alter the source content.

### Gate 5 — Canonical data package

After Gates 1–4:
- freeze the source inventory;
- create a canonical Master Structure data representation;
- retain original keys;
- retain original array item order;
- record navigation order;
- record verification status;
- keep unresolved relationships explicit.

### Gate 6 — Pali Primer integration

Only after the canonical structure is frozen:
- design the Abhidhamma data tables/entities;
- connect the source content;
- implement minimal navigation;
- preserve original Burmese content;
- add no external Abhidhamma material.

## Safety rules

The following are prohibited during recovery:
- guessing missing original text;
- silently correcting source wording;
- importing external Abhidhamma content;
- deleting repeated arrays because they look duplicated;
- treating a filename/key prefix as proof of UI hierarchy;
- calling runtime behavior original exact without evidence.

## Current readiness

The source content is sufficiently recovered to continue verification and documentation.

The project is not yet at final exact-runtime recovery because the classes.dex navigation layer remains unresolved. The formal 100% completion gates are documented in `ABHIDHAMMA_100_PERCENT_GATE.md`.

## Definition of done

Abhidhamma recovery is complete when:
1. all 705 arrays remain accounted for;
2. all 492 navigation labels are accounted for;
3. every navigation relationship is EXACT or explicitly UNRESOLVED;
4. original parent/child order is evidence-backed;
5. runtime behavior is checked;
6. the canonical Master Structure is frozen;
7. the source content remains traceable to the recovered artifact.
