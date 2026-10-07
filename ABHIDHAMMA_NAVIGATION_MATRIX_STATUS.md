# Abhidhamma Navigation Matrix — Recovery Status

## Purpose

Track the 492 original `wf_*` navigation labels before Pali Primer implementation.

## Rules

Each navigation relationship must be classified as:

- **EXACT** — source evidence proves the mapping.
- **PARTIAL** — some source evidence exists, but the complete relationship is not proven.
- **UNRESOLVED** — insufficient surviving evidence; never guess.

## Current verified facts

- Original navigation labels: **492 `wf_*`**
- Original arrays: **705**
- Original array items: **5,398**
- Content source artifact: `abhidhamma_content.min.json`
- Original package: `org.dhammadarna.abhidhamma_myanmar`
- Version: `1.2`

## Matrix completion gate

Before UI/UX implementation:

1. Every 492 `wf_*` labels must have a matrix record.
2. Each record must preserve the original label and key.
3. Matching array key must be recorded when proven.
4. Shared-array reuse must be recorded.
5. Source order must be recorded where recoverable.
6. Parent/child relationship must carry a verification state.
7. No key-prefix inference may be promoted to EXACT without supporting evidence.
8. The final matrix must be traceable to the source artifact.

## Current limitation

The connector can expose the recovered textual schema and source metadata, but the binary APK/`classes.dex` cannot currently be decoded through the available GitHub connector. Therefore runtime-derived hierarchy remains unproven.

This file is a checkpoint, not a claim that all 492 relationships are complete.

## Next execution step

Continue the navigation matrix using every accessible source artifact. When the original APK/DEX becomes available to a local decoder, reconcile the matrix against runtime resource IDs and navigation methods before freezing it.

## Completion rule

The matrix is complete only when all 492 entries are explicitly classified and the final hierarchy is evidence-backed or explicitly marked UNRESOLVED.


## Newly verified compiled-resource evidence

- Original compiled `AndroidManifest.xml` exposes package `org.dhammadarna.abhidhamma_myanmar`, version `1.2`, and launcher activity `IndexActivityWithTitleBar`.
- Original compiled `res/menu/activity_main.xml` contains menu item attributes including id, icon, orderInCategory, showAsAction, and title.
- Original compiled layouts `main_start_view.xml`, `main_start_view_listitem.xml`, `detail_start_view.xml`, and `detail_start_view_listitem.xml` were retrieved as base64 binary resources.
- `main_start_view.xml` contains compiled references to `ListView` and `ExpandableListView`; detail layouts contain compiled `TextView`/content-rendering structures.
- These artifacts prove the original main-menu and main/detail rendering layers, but do not by themselves prove exact `wf_*` parent/child mapping.

## Evidence boundary

Compiled resource IDs constrain the navigation matrix, but entries are not promoted to EXACT without runtime/resource evidence. DEX decoding remains required for method-level navigation behavior.


## Latest accessible-source audit — 2026-10-07

- Searched the recovery branch for textual `wf_*` navigation references; no additional searchable source file was found.
- Searched the original `sangfa727-sketch/Abhidhamma` repository for `IndexActivityWithTitleBar`, layout-name references, and representative `wf_*` keys; no searchable source excerpts were returned.
- Original repository inventory confirms the surviving navigation-relevant artifacts are compiled/binary resources plus the DEX: `classes.dex` (1,658,392 bytes), `resources.arsc` (1,269,092 bytes), compiled layouts, and `activity_main.xml`.
- `abhidhamma_content.min.json` remains present with SHA `64181dd75f31186216f6276351d793511ba78922`, but the connector returns zero content bytes for this large artifact.

### Result

No new source evidence was found that can safely promote navigation relationships to EXACT. Existing mappings remain unchanged. The next decisive evidence source is still a locally decodable APK/DEX, after which resource IDs and runtime dispatch can be reconciled against the 492-entry matrix.
