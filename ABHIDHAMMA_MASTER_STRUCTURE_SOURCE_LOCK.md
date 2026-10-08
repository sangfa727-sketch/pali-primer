# Abhidhamma Master Structure — Source Evidence Lock

**Status:** SOURCE-LEVEL LOCKED  
**Date:** 2026-10-08  
**Source:** `abhidhamma_content.min.json`  
**Source SHA-1:** `64181dd75f31186216f6276351d793511ba78922`  
**Package:** `org.dhammadarna.abhidhamma_myanmar`  
**Version:** `1.2`

## Purpose

Freeze the original top-level Abhidhamma structure directly from the recovered source artifact before any UI/runtime reconstruction.

This document does **not** claim that runtime dispatch, parent/child expansion, or screen rendering has been fully reconstructed.

## Canonical root sequence

The recovered original array `abhidhamma` contains exactly 10 root entries, in this order:

| # | Source root label | Canonical recovered section | Source evidence |
|---:|---|---|---|
| 1 | နိဒါန်း | **s0 — နိဒါန်း** | `abhidhamma[0]` + `wf_s0_introduction` |
| 2 | စိတ္တ - စိတ်ပိုင်း ကျဉ်း၈၉ ကျယ်၁၂၁ ပါး | **s1 — စိတ်ပိုင်း** | `abhidhamma[1]` + `wf_sate` |
| 3 | စေတသိက - စေတသိက်ပိုင်း | **s2 — စေတသိက်ပိုင်း** | `abhidhamma[2]` + `wf_satetathate` |
| 4 | ပကိဏ္ဏက - ပကိဏ်းပိုင်း | **s3 — ပကိဏ်းပိုင်း** | `abhidhamma[3]` + `wf_pakain` |
| 5 | ဝီထိပိုင်း | **s4 — ဝီထိပိုင်း** | `abhidhamma[4]` + `wf_wihti` |
| 6 | ဝီထိမုတ္တ - ဝီထိမုတ်ပိုင်း | **s5 — ဝီထိမုတ်ပိုင်း** | `abhidhamma[5]` + `wf_wihtimote` |
| 7 | ရူပ - ရုပ်ပိုင်း | **s6 — ရုပ်ပိုင်း** | `abhidhamma[6]` + `wf_yote` |
| 8 | သမုစ္စယ - သမုစ္စည်းပိုင်း | **s7 — သမုစ္စည်းပိုင်း** | `abhidhamma[7]` + `wf_thamotesii` |
| 9 | ပစ္စယ - ပစ္စည်းပိုင်း | **s8 — ပစ္စည်းပိုင်း** | `abhidhamma[8]` + `wf_pitsii` |
| 10 | ကမ္မဋ္ဌာန - ကမ္မဋ္ဌာန်းပိုင်း | **s9 — ကမ္မဋ္ဌာန်းပိုင်း** | `abhidhamma[9]` + `wf_kamahtan` |

## Root descriptions

The recovered `abhidhamma_mm` array provides one description for each of the same 10 root positions:

1. **နိဒါန်း** — နိဒါန်းအချီကို ပြဆိုရာ အပိုင်း။
2. **စိတ်ပိုင်း** — စိတ် အကျဉ်း ၈၉-ပါး၊ အကျယ် ၁၂၁-ပါးကို ပြဆိုရာ အပိုင်း။
3. **စေတသိက်ပိုင်း** — စေတသိက် ၅၂-ပါးနှင့် စိတ်-စေတသိက်တို့ယှဉ်ပုံ ပြဆိုရာ အပိုင်း။
4. **ပကိဏ်းပိုင်း** — စိတ်၊ စေတသိက်တို့ကို ဝေဒနာ၊ ဟိတ်၊ ကိစ္စ၊ ဒွါရ၊ အာရုံ၊ ဝတ္ထုအားဖြင့် အထွေထွေ အလီလီ ခွဲခြားဝေဖန် ပြဆိုရာ အပိုင်း။
5. **ဝီထိပိုင်း** — ဒွါရ ခြောက်ပါးတွင် ဝီထိခေါ် သိစိတ်အစဉ်တို့ ဖြစ်ပေါ်ပုံ စိတ္တနိယာမကို ပြဆိုရာ အပိုင်း။
6. **ဝီထိမုတ်ပိုင်း** — ဝီထိတို့မှ လွတ်နေသော ဘဝင်၊ စုတိ၊ ပဋိသန္ဓေ အခိုက်တို့၌ စိတ်အစဉ်ဖြစ်ပုံ ပြဆိုရာ အပိုင်း။
7. **ရုပ်ပိုင်း** — ရုပ် ၂၈-ပါး၊ ရုပ်ဖြစ်ပုံ၊ ရုပ်အစဉ်နှင့် နိဗ္ဗာန်အကြောင်းတို့ကို ပြဆိုရာ အပိုင်း။
8. **သမုစ္စည်းပိုင်း** — စိတ်၊ စေတသိက်၊ ရုပ်၊ နိဗ္ဗာန်တို့အား ခန္ဓာ၊ အာယတန၊ ဓာတ်စသဖြင့် အုပ်စုဖွဲ့စည်းပြဆိုရာ အပိုင်း။
9. **ပစ္စည်းပိုင်း** — အကြောင်းအကျိုး ဆက်နွယ်ပုံတို့ကို ပဋိစ္စသမုပ္ပါဒ်နည်း၊ ပဋ္ဌာန်းနည်းဖြင့် ပြဆိုရာ အပိုင်း။
10. **ကမ္မဋ္ဌာန်းပိုင်း** — သမထ ဝိပဿနာ ကမ္မဋ္ဌာန်းတို့ကို ပြဆိုရာ အပိုင်း။

## Important identity rule

The **source root sequence** is now stronger evidence than semantic interpretation because it is directly represented by the original `abhidhamma` and `abhidhamma_mm` arrays.

The `wf_*` names are navigation identifiers. They must not be rewritten merely to match the visible Burmese root labels.

## Current reconstruction boundary

### Locked at source level
- 10/10 root sections
- Root order 1→10
- Root descriptions 10/10
- Original source labels preserved
- Existing section-specific `wf_*` identifiers preserved

### Still open
- Runtime resource ID → navigation target
- Exact parent/child tree below each root
- PARTIAL/UNRESOLVED navigation dispatch
- Shared-array reuse behavior
- Detail-screen rendering
- Back/next behavior

## Gate

**Master Structure — source level: 100%**

**Master Structure — runtime level: NOT YET 100%**

No runtime relationship is promoted without APK/DEX or equivalent executable evidence.
