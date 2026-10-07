# Original Abhidhamma Recovery Status

## Scope

This document records the verified recovery state of the original Myanmar Abhidhamma Android application used as the source for the Pali Primer project.

Source application:
- Package: org.dhammadarna.abhidhamma_myanmar
- Version: 1.2
- Primary recovered resource: Android resources.arsc
- Repository source artifact: abhidhamma_content.min.json

## Verified source recovery

| Item | Verified result |
|---|---:|
| Original resource strings | 512 |
| Original string arrays | 705 |
| Total array items | 5,398 |
| Navigation wf_* labels | 492 |
| Burmese content | ~420,000 characters |
| Main section prefixes | s0–s9 |
| Source encoding | Myanmar Unicode |

The recovered content is treated as source data, not reconstructed prose.

## Section inventory

| Prefix | Section | Arrays | Items | Recovery |
|---|---|---:|---:|---|
| s0 | နိဒါန်း | 6 | 28 | VERIFIED |
| s1 | စိတ်ပိုင်း | 1 | 16 | VERIFIED |
| s2 | စေတသိက်ပိုင်း | 33 | 282 | VERIFIED |
| s3 | ပကိဏ်းပိုင်း | 39 | 370 | VERIFIED/PARTIAL |
| s4 | ဝီထိပိုင်း | 203 | 1,380 | VERIFIED/PARTIAL |
| s5 | ဝီထိမုတ်ပိုင်း | 81 | 654 | VERIFIED/PARTIAL |
| s6 | ရုပ်ပိုင်း | 60 | 398 | VERIFIED/PARTIAL |
| s7 | သမုစ္စည်းပိုင်း | 47 | 504 | VERIFIED/PARTIAL |
| s8 | ပစ္စည်းပိုင်း | 90 | 592 | VERIFIED |
| s9 | ကမ္မဋ္ဌာန်းပိုင်း | 71 | 554 | VERIFIED |
| shared/other | Shared resources | 74 | 620 | VERIFIED/PARTIAL |
| TOTAL | | 705 | 5,398 | |

## What is already recovered

1. Original resource content has been extracted without adding external Abhidhamma text.
2. Original resource keys and array identities are preserved.
3. Navigation labels using wf_* have been identified.
4. Section-level source inventory has been established.
5. Major section/topic families have been mapped.
6. The 24 Paccaya navigation sequence in s8 has been source-confirmed.
7. s9 meditation, Vipassana and Ariya topic families have been mapped.
8. Repeated text and variant arrays are preserved rather than deduplicated.
9. The preferred Master Structure model separates navigation, sections, content nodes, shared resources, and verification state.

## Important source-integrity rule

Do not:
- invent missing text;
- replace original text with external Abhidhamma material;
- collapse arrays merely because their text is identical;
- infer an exact parent/child relationship from a key prefix alone;
- mark an unresolved runtime relationship as exact.

## Current recovery estimate

These percentages are working engineering estimates, not source metadata:

- Source content recovery: ~95%
- Section mapping: ~90%
- Navigation mapping: ~80%
- Content identity preservation: ~95%
- Master Structure mapping: ~80%
- Runtime/UI hierarchy recovery: ~45%
- Overall recovery: ~85%

## Main unresolved point

The original classes.dex has not yet been successfully decoded in the available GitHub connector environment. Therefore the exact runtime navigation logic and screen-by-screen parent/child hierarchy are not yet proven at 100%.

Current recovery should therefore be described as:

> Original Abhidhamma content: strongly recovered.
> Original runtime hierarchy: partially verified.

abhidhamma_content.min.json remains the source-of-truth content artifact until stronger runtime/source verification is completed.
