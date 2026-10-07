# Abhidhamma 100% Completion Gate

## Objective

Complete the original Abhidhamma recovery to a state that is safe to hand to the Pali Primer UI/UX implementation without restarting source recovery.

**Rule:** 100% means every required source relationship is either evidence-backed as EXACT or explicitly documented as UNRESOLVED with a concrete source limitation. No guessed hierarchy is promoted to exact.

## Verified baseline

- Original application package: `org.dhammadarna.abhidhamma_myanmar`
- Version: `1.2`
- Original arrays: 705
- Original array items: 5,398
- Original navigation labels (`wf_*`): 492
- Recovered source artifact: `abhidhamma_content.min.json`
- Content artifact SHA-1: `64181dd75f31186216f6276351d793511ba78922`
- Original `resources.arsc` SHA-1: `4d6a01bf7d9fc77b89fc24dfba8c3d451edb3e1b`
- Original `classes.dex` SHA-1: `12767bbc1d80d7ddfa88071c6eda694ea8fc88e7`

## Completion gates

### Gate A — Source inventory
- [x] 705 arrays accounted for
- [x] 5,398 array items accounted for
- [x] 492 `wf_*` labels identified
- [x] s0–s9 inventory established
- [x] shared/variant resources preserved

### Gate B — Content identity
- [x] Original resource keys retained
- [x] Original item order retained in the recovered artifact
- [x] Duplicate-looking arrays are not deduplicated
- [x] No external Abhidhamma content introduced

### Gate C — Navigation matrix
- [ ] Every `wf_*` label has an explicit mapping record
- [ ] Original navigation order is recorded
- [ ] Shared-array usage is recorded
- [ ] Each relationship is EXACT / PARTIAL / UNRESOLVED

### Gate D — Exact hierarchy
- [ ] Parent/child relationships are evidence-backed
- [ ] Key-prefix inference is not used as sole evidence
- [ ] Section/topic/content hierarchy is frozen

### Gate E — Runtime/UI logic
- [ ] Main menu behavior verified
- [ ] Section expansion/collapse verified
- [ ] Topic selection verified
- [ ] Detail/content rendering verified
- [ ] Back/next behavior verified where present
- [ ] Shared-resource behavior verified

### Gate F — Canonical master package
- [ ] Navigation-to-content matrix frozen
- [ ] Master hierarchy frozen
- [ ] Every node traceable to an original resource key
- [ ] Verification state included for every relationship

## Current hard blocker

The original `classes.dex` is present in the public source repository, and the Pali Primer recovery branch also contains `Abhidhamma.apk`. However, the available GitHub connector cannot return the binary bytes for these artifacts because they are not UTF-8 text. The connector therefore cannot currently provide a usable DEX/APK payload for decoding.

The original compiled resource layouts are also stored as binary compiled resources rather than editable XML through the connector.

Therefore, runtime/navigation logic cannot honestly be marked 100% recovered from the current connector-accessible evidence.

## Required evidence to close the blocker

One usable binary copy of the original APK or `classes.dex` must be available to a local decoder/runtime inspection step. Once available, the following must be verified:

1. Decode `classes.dex`.
2. Identify activities/fragments/adapters and navigation methods.
3. Trace menu/resource IDs to `wf_*` labels and content arrays.
4. Verify parent/child relationships.
5. Verify screen transitions and back/next behavior.
6. Reconcile runtime findings against the 705-array source inventory.
7. Freeze the final canonical matrix.
8. Run source-integrity checks.

## Completion rule

The Abhidhamma recovery may be declared **100% complete** only when Gates A–F are closed, or when every remaining item is explicitly proven impossible from the surviving original artifacts and the limitation is permanently recorded as UNRESOLVED rather than guessed.

**UI/UX implementation remains blocked until this gate is closed, per project direction.**
