# Abhidhamma Navigation Matrix — Evidence Pass 2026-10-07

## Scope

All 492 original `wf_*` navigation labels are now explicitly enumerated from the recovered `abhidhamma_content.min.json` blob. This is a **source-evidence matrix**, not a runtime claim.

- Total: **492**
- EXACT source-key matches: **112**
- PARTIAL label/content matches: **292**
- UNRESOLVED: **88**
- Source artifact SHA-1: `64181dd75f31186216f6276351d793511ba78922`

## Verification rule

- EXACT = `wf_*` key minus `wf_` is an existing original array key.
- PARTIAL = navigation label text matches one or more recovered array items, but runtime dispatch is not proven.
- UNRESOLVED = no direct key/label-to-array relationship is established from the accessible source artifact.
- **No key-prefix or semantic guess is promoted to EXACT.**

## Matrix

| # | wf key | Original label | Candidate array key | State | Evidence |
|---:|---|---|---|---|---|
| 1 | `wf_abhidhamma` | အဘိဓမ္မာ | `abhidhamma` | **EXACT** | wf key and array key are identical after wf_ removal |
| 2 | `wf_s0_introduction` | နိဒါန်း | `s0_introduction` | **EXACT** | wf key and array key are identical after wf_ removal |
| 3 | `wf_s0_panama_objective` | ပဏာမနှင့် ပဋိညာဉ် | `s0_panama_objective` | **EXACT** | wf key and array key are identical after wf_ removal |
| 4 | `wf_s0_abhidhammahtta` | အဘိဓမ္မတ္ထ | `s0_abhidhammahtta` | **EXACT** | wf key and array key are identical after wf_ removal |
| 5 | `wf_s0_paramatta` | ပရမတ္ထတရား | `s0_paramatta` | **EXACT** | wf key and array key are identical after wf_ removal |
| 6 | `wf_s0_thitsar_2` | သစ္စာ (၂) ပါး | `s0_thitsar_2` | **EXACT** | wf key and array key are identical after wf_ removal |
| 7 | `wf_sate` | စိတ်ပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 8 | `wf_satetathate` | စေတသိက်ပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 9 | `wf_pakain` | ပကိဏ်းပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 10 | `wf_wihti` | ဝီထိပိုင်း | `abhidhamma` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 11 | `wf_wihtimote` | ဝီထိမုတ်ပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 12 | `wf_yote` | ရုပ်ပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 13 | `wf_thamotesii` | သမုစ္စည်းပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 14 | `wf_pitsii` | ပစ္စည်းပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 15 | `wf_kamahtan` | ကမ္မဋ္ဌာန်းပိုင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 16 | `wf_kamawasayar` | ကာမာဝစရစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 17 | `wf_yupar` | ရူပါစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 18 | `wf_ayupar` | အရူပါစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 19 | `wf_lawkotetayar` | လောကုတ္တရာစိတ် | `sate_paing_analysis` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 20 | `wf_yupar_kutho` | ရူပကုသိုလ်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 21 | `wf_yupar_wipat` | ရူပဝိပါက်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 22 | `wf_yupar_kiriya` | ရူပကြိယာစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 23 | `wf_ayupar_kutho` | အရူပကုသိုလ်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 24 | `wf_ayupar_wipat` | အရူပဝိပါက်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 25 | `wf_ayupar_kiriya` | အရူပကြိယာစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 26 | `wf_kama_akutho` | အကုသိုလ်စိတ် | `sate_paing_analysis` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 27 | `wf_kama_ahate` | အဟိတ်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 28 | `wf_kama_thawbana` | ကာမသောဘနစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 29 | `wf_kama_akutho_lawba` | လောဘမူစိတ် | `s5_bonne_kan_paka_htarna_akutho_sate` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 30 | `wf_kama_akutho_dawtha` | ဒေါသမူစိတ် | `s5_bonne_kan_paka_htarna_akutho_sate` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 31 | `wf_kama_akutho_mawha` | မောဟမူစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 32 | `wf_kama_ahate_akuthalawipat` | အကုသလဝိပါက်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 33 | `wf_kama_ahate_kuthalawipat` | အဟိတ်ကုသလဝိပါက်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 34 | `wf_kama_ahate_kiyiya` | အဟိတ်ကြိယာစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 35 | `wf_kama_thawbana_kutho` | မဟာကုသိုလ်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 36 | `wf_kama_thawbana_wipat` | မဟာဝိပါက်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 37 | `wf_kama_thawbana_kiyiya` | မဟာကြိယာစိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 38 | `wf_lawkote_tayar_min` | လောကုတ္တရာစိတ်(ကျဉ်း) | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 39 | `wf_lawkote_tayar_max` | လောကုတ္တရာစိတ်(ကျယ်) | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 40 | `wf_analysis` | သရုပ်ခွဲခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 41 | `wf_s1_notes` | *မှတ်ချက် | `sate_paing` / `s3_katesa_14` / `s4_bumi` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 42 | `wf_lawkote_tayar_mag` | မဂ်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 43 | `wf_lawkote_tayar_poh` | ဖိုလ်စိတ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 44 | `wf_law_kote_tayar_thawtapatti_poh_sate` | သောတာပတ္တိဖိုလ်စိတ် | `law_kote_tayar_thawtapatti_poh_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 45 | `wf_law_kote_tayar_thakadargami_mag_sate` | သကဒါဂါမိမဂ်စိတ် | `law_kote_tayar_thakadargami_mag_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 46 | `wf_law_kote_tayar_thakadargami_poh_sate` | သကဒါဂါမိဖိုလ်စိတ် | `law_kote_tayar_thakadargami_poh_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 47 | `wf_law_kote_tayar_anargami_mag_sate` | အနာဂါမိမဂ်စိတ် | `law_kote_tayar_anargami_mag_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 48 | `wf_law_kote_tayar_anargami_poh_sate` | အနာဂါမိဖိုလ်စိတ် | `law_kote_tayar_anargami_poh_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 49 | `wf_law_kote_tayar_ayathatta_mag_sate` | အရဟတ္တမဂ်စိတ် | `law_kote_tayar_ayathatta_mag_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 50 | `wf_law_kote_tayar_ayathatta_poh_sate` | အရဟတ္တဖိုလ်စိတ် | `law_kote_tayar_ayathatta_poh_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 51 | `wf_s2_satetethake` | စေတသိက် | `s2_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 52 | `wf_s2_satetathake_charac` | စေတသိက်လက္ခဏာ | `s2_satetathake_charac` | **EXACT** | wf key and array key are identical after wf_ removal |
| 53 | `wf_s2_anyathamann` | အညသမာန်း | `s2_anyathamann` | **EXACT** | wf key and array key are identical after wf_ removal |
| 54 | `wf_s2_akutho_satetethake` | အကုသိုလ်စေတသိက် | `s2_akutho_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 55 | `wf_s2_thawbana_satetethake` | သောဘဏစေတသိက် | `s2_thawbana_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 56 | `wf_s2_thatbayawga` | သမ္ပယောဂနည်း | `s2_thatbayawga` | **EXACT** | wf key and array key are identical after wf_ removal |
| 57 | `wf_s2_thingaha` | သင်္ဂဟနည်း | `s2_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 58 | `wf_s2_thatbasateta_thardayana_satetethake` | သဗ္ဗစိတ္တသာဓာရဏ | `s2_thatbasateta_thardayana_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 59 | `wf_s2_pakain_satetethake` | ပကိဏ်းစေတသိက် | `s2_pakain_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 60 | `wf_s2_mawha_satetethake` | မောဟစတုက္က စေတသိက် | `s2_mawha_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 61 | `wf_s2_lawba_satetethake` | လောတြိ စေတသိက် | `s2_lawba_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 62 | `wf_s2_dawtha_satetethake` | ဒေါသစတုက္က စေတသိက် | `s2_dawtha_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 63 | `wf_s2_asone_satetethake` | အဆုံးတြိ စေတသိက် | `s2_asone_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 64 | `wf_s2_thawbana_thardayana_satetethake` | သောဘဏသာဓာရဏ | `s2_thawbana_thardayana_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 65 | `wf_s2_wiyati_satetethake` | ဝိရတိစေတသိက် | `s2_wiyati_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 66 | `wf_s2_appaminnyar_satetethake` | အပ္ပမညာစေတသိက် | `s2_appaminnyar_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 67 | `wf_s2_pyinnyar_satetethake` | ပညိန္ဒြေစေတသိက် | `s2_pyinnyar_satetethake` | **EXACT** | wf key and array key are identical after wf_ removal |
| 68 | `wf_s2_anyarthamann_thatbayawga` | အညသမာန်း သမ္ပယောဂနည်း | `s2_anyarthamann_thatbayawga` | **EXACT** | wf key and array key are identical after wf_ removal |
| 69 | `wf_s2_akutho_thatbayawga` | အကုသိုလ်စေတသိက် သမ္ပယောဂနည်း | `s2_akutho_thatbayawga` | **EXACT** | wf key and array key are identical after wf_ removal |
| 70 | `wf_s2_thawbana_thatbayawga` | သောဘဏစေတသိက် သမ္ပယောဂနည်း | `s2_thawbana_thatbayawga` | **EXACT** | wf key and array key are identical after wf_ removal |
| 71 | `wf_s2_akutho_sate_thingaha` | အကုသိုလ်စိတ် သင်္ဂဟနည်း | `s2_akutho_sate_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 72 | `wf_s2_ahate_sate_thingaha` | အဟိတ်စိတ် သင်္ဂဟနည်း | `s2_ahate_sate_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 73 | `wf_s2_kamawasaya_thawbana_sate_thingaha` | ကာမသောဘဏစိတ် သင်္ဂဟနည်း | `s2_kamawasaya_thawbana_sate_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 74 | `wf_s2_mahatgote_sate_thingaha` | မဟဂ္ဂုတ်စိတ် သင်္ဂဟနည်း | `s2_mahatgote_sate_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 75 | `wf_s2_lawkotetaya_sate_thingaha` | လောကုတ္တရာစိတ် သင်္ဂဟနည်း | `s2_lawkotetaya_sate_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 76 | `wf_s2_niyata_aniyata_yawgi` | စေတသိက်များ၏သဘော | `s2_niyata_aniyata_yawgi` | **EXACT** | wf key and array key are identical after wf_ removal |
| 77 | `wf_s3_waydanar_thingaha` | ဝေဒနာသင်္ဂဟ | `s3_waydanar_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 78 | `wf_s3_haytu_all` | ဟေတုသင်္ဂဟ | `s3_haytu_all` | **EXACT** | wf key and array key are identical after wf_ removal |
| 79 | `wf_s3_katsa_thingaha` | ကိစ္စသင်္ဂဟ | `s3_katsa_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 80 | `wf_s3_dwarya_thingaha` | ဒါွရသင်္ဂဟ | `s3_dwarya_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 81 | `wf_s3_aramana_thingaha` | အာရမ္မဏသင်္ဂဟ | `s3_aramana_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 82 | `wf_s3_wotehtu_thingaha` | ဝတ္ထုသင်္ဂဟ | `s3_wotehtu_thingaha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 83 | `wf_s3_waydanar_aryamana_nubawa` | အာရမ္မဏနုဘဝနည်း | `s3_waydanar_aryamana_nubawa` | **EXACT** | wf key and array key are identical after wf_ removal |
| 84 | `wf_s3_waydanar_eaindiya_bayda` | ဣန္ဒြိယ ဘေဒနည်း | `s3_waydanar_eaindiya_bayda` | **EXACT** | wf key and array key are identical after wf_ removal |
| 85 | `wf_s3_waydanar_sate_together_eaindiya` | ဣန္ဒြိယ ဘေဒနည်းဖြင့် စိတ်ကိုဝေဖန်ခြင်း | `s3_waydanar_sate_together_eaindiya` | **EXACT** | wf key and array key are identical after wf_ removal |
| 86 | `wf_s3_waydanar_sate_together_aryamana` | အာရမ္မဏ နုဘဝနနည်းဖြင့် စိတ်ကိုဝေဖန်ခြင်း | `s3_waydanar_sate_together_aryamana` | **EXACT** | wf key and array key are identical after wf_ removal |
| 87 | `wf_s3_haytu_6` | ဟိတ် (၆) ပါး | `s3_hatu_thingaha` / `s3_hatu_thingaha_mm` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 88 | `wf_s3_haytu_sate_analysis` | စိတ်ကို ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 89 | `wf_s3_haytu_zate_analysis` | ဇာတိဘေဒအားဖြင့် ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 90 | `wf_s3_haytu_bumi_analysis` | ဘူမိဘေဒအားဖြင့် ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 91 | `wf_s3_haytu_potegala_analysis` | ပုဂ္ဂလဘေဒအားဖြင့် ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 92 | `wf_s3_haytu_tate_analysis` | တိတ်ဖြင့် ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 93 | `wf_s3_katesa_14` | ကိစ္စ | `s3_katesa_14` | **EXACT** | wf key and array key are identical after wf_ removal |
| 94 | `wf_s3_katesa_sate_together` | ကိစ္စဖြင့် စိတ်ကို ဝေဖန်ခြင်း | `s3_katesa_sate_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 95 | `wf_s3_katesa_htarna_together` | ဌာနဖြင့် စိတ်ကို ဝေဖန်ခြင်း | `s3_katesa_htarna_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 96 | `wf_s3_katesa_htarna_sate_together` | ကိစ္စနှင့်ဌာန တပ်သောစိတ်များ | `s3_katesa_htarna_sate_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 97 | `wf_s3_dwarya_6` | ဒါွရ ၆-ပါး | `s3_dwarya_6` | **EXACT** | wf key and array key are identical after wf_ removal |
| 98 | `wf_s3_dwarya_each_sate_together` | ဒွါရဖြင့် စိတ်ကို ဝေဖန်ခြင်း | `s3_dwarya_each_sate_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 99 | `wf_s3_dwarya_all_sate_together` | ဆိုင်ရာ စိတ်တို့ ဖြစ်နိုင်ရာ ဒွါရများ | `s3_dwarya_all_sate_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 100 | `wf_s3_aryone_6` | အာရုံ ၆-ပါး | `s3_aryone_6` | **EXACT** | wf key and array key are identical after wf_ removal |
| 101 | `wf_s3_aryone_sate_together` | အာရုံဖြင့် စိတ်ကို ဝေဖန်ခြင်း | `s3_aryone_sate_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 102 | `wf_s3_aryone_each_sate_together` | ဧကန်၊ အနေကန် အာရုံပြုသော စိတ်များ | `s3_aryone_each_sate_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 103 | `wf_s3_wotehtu_6` | ဝတ္ထု ၆-ပါး | `s3_wotehtu_6` | **EXACT** | wf key and array key are identical after wf_ removal |
| 104 | `wf_s3_wotehtu_bonne` | ဝတ္ထုဖြင့် ဘုံကို ဝေဖန်ခြင်း | `s3_wotehtu_bonne` | **EXACT** | wf key and array key are identical after wf_ removal |
| 105 | `wf_s3_wotehtu_watenyanadate` | ဝိညာဏဓာတ် | `s3_wotehtu_watenyanadate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 106 | `wf_s3_wotehtu_date_3` | ဝိညာဏဓာတ် | `s3_wotehtu_date_3` | **EXACT** | wf key and array key are identical after wf_ removal |
| 107 | `wf_s3_wotehtu_sate_together` | ဝတ္ထုဖြင့် စိတ်ကို ဝေဖန်ခြင်း | `s3_wotehtu_sate_together` | **EXACT** | wf key and array key are identical after wf_ removal |
| 108 | `wf_s5_wihtimote` | ဝီထိမုတ် | `s5_wihtimote` | **EXACT** | wf key and array key are identical after wf_ removal |
| 109 | `wf_s5_bumi_satuka` | ဘူမိစတုက္က | `s5_bumi_satuka` | **EXACT** | wf key and array key are identical after wf_ removal |
| 110 | `wf_s5_padi_thanday` | ပဋိသန္ဓိစတုက္က | `s5_padi_thanday` | **EXACT** | wf key and array key are identical after wf_ removal |
| 111 | `wf_s5_bonne_kan` | ကမ္မစတုက္က | `s5_bonne_kan` | **EXACT** | wf key and array key are identical after wf_ removal |
| 112 | `wf_s5_sutay` | မရဏပ္ပတ္တိစတုက္က | `s5_sutay` | **EXACT** | wf key and array key are identical after wf_ removal |
| 113 | `wf_s5_bumi_satuka_apal` | အပါယ်ဘုံ | `s5_bumi_satuka_apal` | **EXACT** | wf key and array key are identical after wf_ removal |
| 114 | `wf_s5_bumi_satuka_kama_thugati` | ကာမသုဂတိဘုံ | `s5_bumi_satuka_kama_thugati` | **EXACT** | wf key and array key are identical after wf_ removal |
| 115 | `wf_s5_bumi_walkarya` | ဝေါကာရဘုံ ၃ မျိုး | `s5_bumi_satuka` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 116 | `wf_s5_bumi_yupa_bonne` | ရူပဘုံ | `s5_bumi_yupa_bonne` | **EXACT** | wf key and array key are identical after wf_ removal |
| 117 | `wf_s5_bumi_yupa_bonne_first` | ပထမဈာန်ဘုံ | `s5_bumi_yupa_bonne_first` | **EXACT** | wf key and array key are identical after wf_ removal |
| 118 | `wf_s5_bumi_yupa_bonne_second` | ဒုတိယဈာန်ဘုံ | `s5_bumi_yupa_bonne_second` | **EXACT** | wf key and array key are identical after wf_ removal |
| 119 | `wf_s5_bumi_yupa_bonne_third` | တတိယဈာန်ဘုံ | `s5_bumi_yupa_bonne_third` | **EXACT** | wf key and array key are identical after wf_ removal |
| 120 | `wf_s5_bumi_yupa_bonne_fourth` | စတုတ္ထဈာန်ဘုံ | `s5_bumi_yupa_bonne_fourth` | **EXACT** | wf key and array key are identical after wf_ removal |
| 121 | `wf_s5_bumi_a_yupa_bonne` | အရူပဘုံ | `s5_bumi_a_yupa_bonne` | **EXACT** | wf key and array key are identical after wf_ removal |
| 122 | `wf_s5_bumi_bonne_pote_goo` | ဘုံနှင့် ပုဂ္ဂိုလ် | `s5_bumi_bonne_pote_goo` | **EXACT** | wf key and array key are identical after wf_ removal |
| 123 | `wf_s5_padi_thanday_4` | ပဋိသန္ဓေ ၄ မျိုး | `s5_padi_thanday` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 124 | `wf_s5_padi_thanday_bonnthar` | ပဋိသန္ဓေ နှင့် ဆိုင်ရာဘုံသား | `s5_padi_thanday` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 125 | `wf_s5_padi_thanday_person` | လူ့ဘုံမှ သုဂတိ အဟိတ် ပုဂ္ဂိုလ် များ | `s5_padi_thanday` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 126 | `wf_s5_padi_thanday_lifetime` | ဘုံ နှင့် သက်တမ်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 127 | `wf_s5_padi_thanday_katt` | ကပ် ၄ ပါး | `s5_padi_thanday` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 128 | `wf_s5_padi_thanday_worldend` | ကမ္ဘာ ပျက်ပုံ | `s5_padi_thanday` / `s5_bonne_kabar_pyatpoon` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 129 | `wf_s5_padi_thanday_3in1` | တစ်ဘဝ၌တူမြဲ တရားသုံးပါး | `s5_padi_thanday` / `s5_one_life_same_three` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 130 | `wf_s5_padi_thanday_lifetime_apalluathura` | အပါယ် ၄ ဘုံ၊ လူနှင့် အသုရာတို့ သက်တမ်း | `s5_bonne_lifetime` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 131 | `wf_s5_padi_thanday_lifetime_nat` | နတ်တို့သက်တမ်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 132 | `wf_s5_padi_thanday_lifetime_byamhar` | ဗြဟ္မာတို့၏ သက်တမ်း | `s5_bonne_lifetime` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 133 | `wf_s5_bonne_kan_katesa` | ကိစ္စစတုက္က | `s5_bonne_kan_katesa` | **EXACT** | wf key and array key are identical after wf_ removal |
| 134 | `wf_s5_bonne_kan_pakadana` | ပါကဒါန ပရိယာယစတုက္က | `s5_bonne_kan` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 135 | `wf_s5_bonne_kan_pakakala` | ပါကကာလစတုက္က | `s5_bonne_kan` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 136 | `wf_s5_bonne_kan_pakahtarna` | ပါကဌာနစတုက္က | `s5_bonne_kan` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 137 | `wf_s5_bonne_kan_pakahtarna_akutho` | အကုသိုလ်ကံ ၁၂ ပါး | `s5_bonne_kan_paka_htarna` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 138 | `wf_s5_bonne_kan_pakahtarna_kama` | ကာမကုသိုလ်ကံ ၈ ပါး | `s5_bonne_kan_paka_htarna` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 139 | `wf_s5_bonne_kan_pakahtarna_yupa` | ရူပကုသိုလ်ကံ ၅ ပါး | `s5_bonne_kan_paka_htarna` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 140 | `wf_s5_bonne_kan_pakahtarna_ayupa` | အရူပ ကုသိုလ်ကံ ၄ ပါး | `s5_bonne_kan_paka_htarna` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 141 | `wf_s5_bonne_kan_pakahtarna_akutho_kaya` | ကာယကံ ၃ ပါး | `s5_bonne_kan_paka_htarna_akutho` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 142 | `wf_s5_bonne_kan_pakahtarna_akutho_wasi` | ဝစီကံ ၄ ပါး | `s5_bonne_kan_paka_htarna_akutho` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 143 | `wf_s5_bonne_kan_pakahtarna_akutho_manaw` | မနောကံ ၃ ပါး | `s5_bonne_kan_paka_htarna_akutho` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 144 | `wf_s5_bonne_kan_pakahtarna_akutho_sate` | ဒုစရိုက်လွန်ကျူးသော စိတ်များ | `s5_bonne_kan_paka_htarna_akutho` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 145 | `wf_s5_bonne_kan_pakahtarna_kama_about` | ကာမကုသိုလ်ကံ အကြောင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 146 | `wf_s5_bonne_kan_pakahtarna_kama_thusayat` | သုစရိုက် ၁၀ ပါး | `s5_bonne_kan_paka_htarna_karma_kutho` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 147 | `wf_s5_bonne_kan_pakahtarna_kama_potnya` | ပုညကြိယာဝတ္ထု ၁၀ ပါး | `s5_bonne_kan_paka_htarna_karma_kutho` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 148 | `wf_s5_bonne_kan_pakahtarna_kama_special` | ကာမကုသိုလ် အထူး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 149 | `wf_s5_bonne_kan_pakahtarna_kama_bon` | အကျိုးပေးရာအခါ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 150 | `wf_s5_bonne_kan_pakahtarna_kama_bon_dwi` | သြကမ ဥက္ကဋ္ဌကုသိုလ် အကျိုးပေး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 151 | `wf_s5_bonne_kan_pakahtarna_kama_thusayat_kaya` | ကာယသုစရိုက် ၃ ပါး | `s5_bonne_kan_paka_htarna_karma_kutho_thusayite` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 152 | `wf_s5_bonne_kan_pakahtarna_kama_thusayat_wasi` | ဝစီသုစရိုက် ၄ ပါး | `s5_bonne_kan_paka_htarna_karma_kutho_thusayite` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 153 | `wf_s5_bonne_kan_pakahtarna_kama_thusayat_manaw` | မနောသုစရိုက် ၃ ပါး | `s5_bonne_kan_paka_htarna_karma_kutho_thusayite` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 154 | `wf_s5_bonne_kan_pakahtarna_yupa_about` | ရူပ ကုသိုလ်ကံ အကြောင်း | `s5_bonne_kan_paka_htarna_yupa` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 155 | `wf_s5_bonne_kan_pakahtarna_yupa_special` | ဈာန် ကုသိုလ် အထူး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 156 | `wf_s5_bonne_kan_pakahtarna_yupa_bon` | အကျိုးပေးရာ ဘုံဌာနများ | `s5_bonne_kan_paka_htarna_yupa` / `s5_bonne_kan_paka_htarna_ayupa` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 157 | `wf_s5_bonne_kan_pakahtarna_ayupa_about` | အရူပ ကုသိုလ်ကံ အကြောင်း | `s5_bonne_kan_paka_htarna_ayupa` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 158 | `wf_s5_bonne_kan_pakahtarna_ayupa_bon` | အကျိုးပေးရာ ဘုံဌာနများ | `s5_bonne_kan_paka_htarna_yupa` / `s5_bonne_kan_paka_htarna_ayupa` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 159 | `wf_s5_sutay_reason` | သေခြင်းအကြောင်း ၄ ပါး | `s5_sutay_reason` | **EXACT** | wf key and array key are identical after wf_ removal |
| 160 | `wf_s5_sutay_nimate` | သေခါနီး နိမိတ် ၃ ပါး | `s5_sutay` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 161 | `wf_s5_sutay_witi` | မရဏာသန္န ဝီထိ | `s5_sutay` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 162 | `wf_s5_sutay_how` | ပဋိသန္ဓေစိတ်ဖြစ်ပုံ | `s5_sutay` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 163 | `wf_s5_sutay_ryon` | ပဋိသန္ဓေစိတ်၏ အာရုံ | `s5_sutay` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 164 | `wf_s5_sutay_naun` | စုတိနောင် ပဋိသန္ဓေ နှောင်းပုံ | `s5_sutay` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 165 | `wf_s5_sutay_byarma` | ဗြဟ္မာများ စုတိပြီးနောက် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 166 | `wf_s5_sutay_cut` | သံသရာစက်လည်ပုံ ပြတ်ပုံ | `s5_sutay` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 167 | `wf_s5_sutay_witi_ati` | အတိမဟန္တာရုံ ပဉ္စဒွါရ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 168 | `wf_s5_sutay_witi_mahan` | မဟန္တာရုံ ပဉ္စဒွါရ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 169 | `wf_s5_sutay_witi_atiwi` | ဝိဘူတာရုံ မနောဒွါရ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 170 | `wf_s5_sutay_witi_wibu` | အဝိဘူတာရုံမနောဒွါရ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 171 | `wf_s5_sutay_ryon_kama` | ကာမပဋိသန္ဓေ စိတ်၏ အာရုံ | `s5_sutay_padi_thantay_aryon` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 172 | `wf_s5_sutay_ryon_yuayu` | ရူပ၊ အရူပပဋိသန္ဓေ စိတ်၏ အာရုံ | `s5_sutay_padi_thantay_aryon` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 173 | `wf_s7_thamotesii` | သမုစ္စည်းပိုင်း | `s7_thamotesii` | **EXACT** | wf key and array key are identical after wf_ removal |
| 174 | `wf_s7_thamotesii_akuthala` | အကုသလသင်္ဂဟ | `s7_thamotesii` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 175 | `wf_s7_thamotesii_matethaitka` | မိဿကသင်္ဂဟ | `s7_thamotesii` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 176 | `wf_s7_thamotesii_bodhi` | ဗောဓိပက္ခိယသင်္ဂဟ | `s7_thamotesii` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 177 | `wf_s7_thamotesii_thatba` | သဗ္ဗသင်္ဂဟ | `s7_thamotesii` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 178 | `wf_s7_thamotesii_akuthala_rthawa` | အာသဝေါတရား ၄ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 179 | `wf_s7_thamotesii_akuthala_ulga` | သြဃ ၄ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 180 | `wf_s7_thamotesii_akuthala_yawga` | ယောဂ ၄ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 181 | `wf_s7_thamotesii_akuthala_ganhta` | ဂန ္ထ၄ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 182 | `wf_s7_thamotesii_akuthala_upadan` | ဥပါဒါန် ၄ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 183 | `wf_s7_thamotesii_akuthala_niwarana` | နီဝရဏ ၆ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 184 | `wf_s7_thamotesii_akuthala_anuthaya` | အနုသယ ၇ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 185 | `wf_s7_thamotesii_akuthala_thanyawzin` | သံယောဇဉ် ၁၀ ပါး | `s7_akuthala_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 186 | `wf_s7_thamotesii_akuthala_kilaythar` | ကိလေသာ ၁၀ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 187 | `wf_s7_thamotesii_matethaitka_hate` | ဟိတ် ၆ ပါး | `s7_matethaka_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 188 | `wf_s7_thamotesii_matethaitka_sarnin` | ဈာနင် ၇ ပါး | `s7_matethaka_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 189 | `wf_s7_thamotesii_matethaitka_maegin` | မဂ္ဂင် ၁၂ ပါး | `s7_matethaka_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 190 | `wf_s7_thamotesii_matethaitka_eaindray` | ဣန္ဒြေ ၂၂ ပါး | `s7_matethaka_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 191 | `wf_s7_thamotesii_matethaitka_bo` | ဗိုလ် ၉ ပါး | `s7_matethaka_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 192 | `wf_s7_thamotesii_matethaitka_adipadi` | အဓိပတိ ၄ ပါး | `s7_matethaka_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 193 | `wf_s7_thamotesii_matethaitka_rhaya` | အာဟာရ ၄ ပါး | `s7_matethaka_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 194 | `wf_s7_thamotesii_bodhi_thatipahtan` | သတိပဋ္ဌာန် ၄ ပါး | `s7_baldipatekiya_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 195 | `wf_s7_thamotesii_bodhi_thatmatpadan` | သမ္မပ္ပဓာန် ၄ ပါး | `s7_baldipatekiya_thingaha_thamapahtan` / `s7_baldipatekiya_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 196 | `wf_s7_thamotesii_bodhi_eaindipat` | ဣဒ္ဓိပါဒ် ၄ ပါး | `s7_baldipatekiya_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 197 | `wf_s7_thamotesii_bodhi_eaindray` | ဣန္ဒြေ ၅ ပါး | `s7_baldipatekiya_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 198 | `wf_s7_thamotesii_bodhi_boo` | ဗိုလ် ၅ ပါး | `s7_baldipatekiya_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 199 | `wf_s7_thamotesii_bodhi_balzin` | ဗောဇ္ဈင် ၇ ပါး | `s7_baldipatekiya_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 200 | `wf_s7_thamotesii_bodhi_maegin` | မဂ္ဂင် ၈ ပါး | `s7_baldipatekiya_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 201 | `wf_s7_thamotesii_bodhi_notes` | တရားကိုယ် ၁၄ ပါးတို့၏ ဖြစ်ရာဌာနများ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 202 | `wf_s7_thamotesii_thatba_khandar` | ခန္ဓာ ၅ ပါး | `s7_thatba_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 203 | `wf_s7_thamotesii_thatba_upardanankhandar` | ဥပါဒါနက္ခန္ဓာ ၅ ပါး | `s7_thatba_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 204 | `wf_s7_thamotesii_thatba_thitsar` | သစ္စာ ၄ ပါး | `s7_thatba_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 205 | `wf_s7_thamotesii_thatba_aryata` | အာယတန ၁၂ ပါး | `s7_thatba_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 206 | `wf_s7_thamotesii_thatba_datt` | ဓာတ် ၁၈ ပါး | `s7_thatba_thingaha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 207 | `wf_s7_thamotesii_thatba_note` | * မှတ်ချက် | `s4_manaw_appa_note_sana` / `s4_manaw_appa_note_pala` / `s4_manaw_appa_note_niyawda` / `s4_pokegala_person_sate_yupa` / `s4_pokegala_person_sate_ayupa` / `s4_manaw_tadayone_zaw_right` / `s4_manaw_tadayone_zaw_naun_tadayone` / `s4_intro_sasatka_wipatthayapatwatti_6` / `s5_padi_thanday_list` / `s5_sutay_reason` / `s5_sutay_wihti_mahantar` / `s6_nibanna_property` / `s6_yote_pawattikama_zat_4` / `s6_yote_thamotedaytha_uparda_gawsaya_7` / `s6_yote_thamotedaytha_uparda_wikaya_3` / `s6_yote_thamotedaytha_uparda_letkana_4` / `s6_yote_thamotehtana_yote_amyoasar` / `s7_baldipatekiya_thingaha_matgin_8` / `s7_matethaka_thingaha_zarnin` / `s7_matethaka_thingaha_matgin` / `s7_matethaka_thingaha_eaindray` / `s7_thatba_thingaha_thittsar` / `s7_thatba_thingaha` / `s8_pyinsii_padatesa_tayar_waitnyana` / `s8_pyinsii_padatesa_notes_wott` / `s8_pyinnyat_thatda_knowhow` / `s9_kamahtan_thamahta_40_upaminnyar_4` / `s9_kamahtan_gawsaya_bawana_nimate` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 208 | `wf_s7_thamotesii_thatba_aryata_in` | အတွင်း အဇ္ဈတ္တိကာယတန ၆ ပါး | `s7_thatba_thingaha_aryartana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 209 | `wf_s7_thamotesii_thatba_aryata_out` | အပြင် ဗာဟိရာယတန ၆ ပါး | `s7_thatba_thingaha_aryartana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 210 | `wf_s7_thamotesii_thatba_datt_akan` | ဒွါရ ၆ ပုံ (အခံဓာတ်) | `s7_thatba_thingaha_datt` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 211 | `wf_s7_thamotesii_thatba_datt_atite` | အာရုံ ၆ တန် (အတိုက်ဓာတ်) | `s7_thatba_thingaha_datt` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 212 | `wf_s7_thamotesii_thatba_datt_apwint` | ဝိညာဏ် ၆ သွယ် (အပွင့်ဓာတ်) | `s7_thatba_thingaha_datt` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 213 | `wf_s6_yote` | ရုပ် | `s6_yote` | **EXACT** | wf key and array key are identical after wf_ removal |
| 214 | `wf_s6_yote_nibanna` | နိဗ္ဗာန် | `s0_paramatta` / `s6_yote` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 215 | `wf_s6_yote_thamotedaytha` | ရူပသမုဒ္ဒေသ | `s6_yote_thamotedaytha` | **EXACT** | wf key and array key are identical after wf_ removal |
| 216 | `wf_s6_yote_wibaga` | ရူပဝိဘာဂ | `s6_yote_yupa` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 217 | `wf_s6_yote_thatmotehtarna` | ရူပသမုဋ္ဌာန | `s6_yote_yupa` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 218 | `wf_s6_yote_kalarpa` | ရူပကလာပ | `s6_yote_yupa` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 219 | `wf_s6_yote_pawattikama` | ရူပပဝတ္တိက္ကမ | `s6_yote_pawattikama` | **EXACT** | wf key and array key are identical after wf_ removal |
| 220 | `wf_s6_yote_thamotedaytha_buta` | ဘူတရုပ် ၄ ပါး | `s6_yote_thamotedaytha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 221 | `wf_s6_yote_thamotedaytha_upadar` | ဥပါဒါရုပ် ၂၄ ပါး | `s6_yote_thamotedaytha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 222 | `wf_s6_yote_thamotedaytha_note` | မှတ်ချက် | `s4_pyitsa_garna_4_1` / `s4_pyitsa_karya_4_1` / `s4_pokegala_person_putuzin` / `s4_pokegala_person_ariya_pho` / `s4_pokegala_bon_person` / `s4_pyitsa_satku_4_1` / `s4_pyitsa_thawta_4_1` / `s4_pyitsa_zeitwa_4_1` / `s5_bonne_byanmhar_lifetime` / `s6_yote_thamotedaytha` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 223 | `wf_s6_yote_thamotedaytha_upadar_pathada` | ပသာဒရုပ် ၅ ပါး | `s6_yote_thamotedaytha_uparda_28` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 224 | `wf_s6_yote_thamotedaytha_upadar_gawsaya` | ဂေါစရရုပ် ၇ ပါး | `s6_yote_thamotedaytha_uparda_28` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 225 | `wf_s6_yote_thamotedaytha_upadar_bawa` | ဘာဝရုပ် ၂ ပါး | `s6_yote_thamotedaytha_uparda_28` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 226 | `wf_s6_yote_thamotedaytha_upadar_hadaya` | ဟဒယဝတ္ထုရုပ် | `s6_yote_thamotedaytha_uparda_28` / `s6_yote_thamotedaytha_uparda_hadaya` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 227 | `wf_s6_yote_thamotedaytha_upadar_ziwita` | ဇီဝိတရုပ် | `s6_yote_thamotedaytha_uparda_28` / `s6_yote_thamotedaytha_uparda_ziwita` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 228 | `wf_s6_yote_thamotedaytha_upadar_rhaya` | အာဟာရရုပ် | `s6_yote_thamotedaytha_uparda_28` / `s6_yote_thamotedaytha_uparda_rhaya` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 229 | `wf_s6_yote_thamotedaytha_upadar_parisada` | ပရိစ္ဆေဒရုပ် | `s6_yote_thamotedaytha_uparda_28` / `s6_yote_thamotedaytha_uparda_parisayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 230 | `wf_s6_yote_thamotedaytha_upadar_winyat` | ဝိညတ်ရုပ် ၂ ပါး | `s6_yote_thamotedaytha_uparda_28` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 231 | `wf_s6_yote_thamotedaytha_upadar_wikaya` | ဝိကာရရုပ် ၃ ပါး | `s6_yote_thamotedaytha_uparda_28` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 232 | `wf_s6_yote_thamotedaytha_upadar_latkhana` | လက္ခဏရုပ် ၄ ပါး | `s6_yote_thamotedaytha_uparda_28` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 233 | `wf_s6_yote_thamotedaytha_note_natepanna` | နိပ္ဖန္နရုပ် ၁၈ ပါး | `s6_yote_thamotedaytha_notes` / `s6_yote_thamotedaytha_notes_natphanna_18` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 234 | `wf_s6_yote_thamotedaytha_note_anatepanna` | အနိပ္ဖန္နရုပ် ၁၀ ပါး | `s6_yote_thamotedaytha_notes` / `s6_yote_thamotedaytha_notes_arnatphanna_10` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 235 | `wf_s6_yote_thamotedaytha_note_same_count` | ရုပ်ကို ဇာတ်တူ အားဖြင့် ရေတွက်နည်း | `s6_yote_thamotedaytha_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 236 | `wf_s6_yote_thamotedaytha_note_special` | အထူး မှတ်ရန် | `s6_yote_thamotedaytha_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 237 | `wf_s6_yote_wibaga_diwida` | ဒုဝိဓနည်း | `s6_yote_wiparga` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 238 | `wf_s6_yote_wibaga_aekawida` | ဧကဝိဓနည်း | `s6_yote_wiparga` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 239 | `wf_s6_yote_thatmotehtarna_4` | သမုဋ္ဌာန် ၄ ပါး | `s6_yote_thamotehtana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 240 | `wf_s6_yote_thatmotehtarna_cause` | ရုပ်ကို ဖြစ်စေခြင်း အကြောင်း | `s6_yote_thamotehtana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 241 | `wf_s6_yote_thatmotehtarna_cause_not` | ရုပ်ကို မဖြစ်စေခြင်း အကြောင်း | `s6_yote_thamotehtana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 242 | `wf_s6_yote_thatmotehtarna_process` | ရုပ်ဖြစ်ပုံ | `s6_yote_thamotehtana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 243 | `wf_s6_yote_thatmotehtarna_yote_sort` | ရုပ် အမျိုးအစားများ | `s6_yote_thamotehtana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 244 | `wf_s6_yote_thatmotehtarna_laugh_sate` | * ပြုံးရယ်သောစိတ်များ | `s6_yote_thamotehtana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 245 | `wf_s6_yote_kalarpa_charac` | ရုပ်ကလာပ် တို့၏ လက္ခဏာ ၄ ရပ် | `s6_yote_kalatsii` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 246 | `wf_s6_yote_kalarpa_sort` | ရုပ်ကလာပ် အမျိုးအစားများ | `s6_yote_kalatsii` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 247 | `wf_s6_yote_kalarpa_sort_kamaza` | ကမ္မဇကလာပ် ၉ စည်း | `s6_yote_kalatsii_sort` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 248 | `wf_s6_yote_kalarpa_sort_sattaza` | စိတ္တဇကလာပ် ၆ စည်း | `s6_yote_kalatsii_sort` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 249 | `wf_s6_yote_kalarpa_sort_utuza` | ဥတုဇကလာပ် ၄ စည်း | `s6_yote_kalatsii_sort` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 250 | `wf_s6_yote_kalarpa_sort_rhaya` | အာဟာရဇကလာပ် ၂ စည်း | `s6_yote_kalatsii_sort` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 251 | `wf_s6_yote_kalarpa_sort_izatta_bahattda` | အဇ္ဈတ္တ ဗဟိဒ္ဓရုပ် ကလာပ် ခွဲပုံ | `s6_yote_kalatsii_sort` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 252 | `wf_s6_yote_pawattikama_akhar` | ပဋိသန္ဓေအခါ နှင့် ပဝတ္တိအခါ | `s6_yote_pawattikama` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 253 | `wf_s6_yote_pawattikama_bonn` | ဘုံ ၃ ပါး၌ ရနိုင်သော ရုပ်များ | `s6_yote_pawattikama` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 254 | `wf_s6_yote_pawattikama_yawni` | ယောနိခေါ် အမျိုးဇာတ် ၄ ပါး | `s6_yote_pawattikama` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 255 | `wf_s6_yote_pawattikama_padithaday_process` | ပဋိသန္ဓေအခါ ရုပ်ဖြစ်စဉ် | `s6_yote_pawattikama` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 256 | `wf_s6_yote_pawattikama_satu_process` | စတုဇရုပ် တို့၏ ဖြစ်စဉ် | `s6_yote_pawattikama` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 257 | `wf_s6_yote_pawattikama_satu_re_process` | စတုဇရုပ် တို့၏ ဖြစ်ပျက်စဉ် | `s6_yote_pawattikama` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 258 | `wf_s6_yote_nibanna_2_types` | နိဗ္ဗာန် ၂ မျိုး | `s6_nibanna` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 259 | `wf_s6_yote_nibanna_3_types` | နိဗ္ဗာန် ၃ မျိုး | `s6_nibanna` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 260 | `wf_s6_yote_nibanna_property` | နိဗ္ဗာန်၏ ဂုဏ်ပုဒ်များ | `s6_nibanna_property` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 261 | `wf_s8_pyinsii_notes` | ပစ္စည်းပိုင်း သိမှတ်ဖွယ်ရာများ | `s8_pyinsii_notes` | **EXACT** | wf key and array key are identical after wf_ removal |
| 262 | `wf_s8_pyinsii_padatesa` | ပဋိစ္စသမုပ္ပါဒ်နည်း | `s8_pyinsii` / `s8_pyinsii_notes_2types` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 263 | `wf_s8_pyinsii_pahtan` | ပဋ္ဌာန်းနည်း | `s8_pyinsii` / `s8_pyinsii_notes_2types` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 264 | `wf_s8_pyinsii_pyinnyat` | ပညတ် ၂ မျိုး | `s8_pyinsii` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 265 | `wf_s8_pyinsii_notes_how` | ပစ္စည်း၊ ပစ္စယုပ္ပန်၊ ပစ္စယသတ္တိနှင့် ကျေးဇူးပြုပုံ | `s8_pyinsii_notes_how` | **EXACT** | wf key and array key are identical after wf_ removal |
| 266 | `wf_s8_pyinsii_notes_2types` | ကျေးဇူးပြုနည်း ၂ မျိုး | `s8_pyinsii_notes_2types` | **EXACT** | wf key and array key are identical after wf_ removal |
| 267 | `wf_s8_pyinsii_padatesa_tayar` | ပဋိစ္စသမုပ္ပါဒ် တရားတော် | `s8_pyinsii_padatesathamotepat` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 268 | `wf_s8_pyinsii_padatesa_notes` | သိမှတ်ဖွယ်များ | `s8_pyinsii_padatesa_notes` | **EXACT** | wf key and array key are identical after wf_ removal |
| 269 | `wf_s8_pyinsii_padatesa_tayar_1` | (၁) အဝိဇ္ဇာပစ္စယာ သင်္ခါရာ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 270 | `wf_s8_pyinsii_padatesa_tayar_2` | (၂) သင်္ခါရပစ္စယာ ဝိညာဏံ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 271 | `wf_s8_pyinsii_padatesa_tayar_3` | (၃) ဝိညာဏပစ္စယာ နာမရူပံ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 272 | `wf_s8_pyinsii_padatesa_tayar_4` | (၄) နာမရူပပစ္စယာ သဠာယတနံ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 273 | `wf_s8_pyinsii_padatesa_tayar_5` | (၅) သဠာယတနပစ္စယာ ဖဿော | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 274 | `wf_s8_pyinsii_padatesa_tayar_6` | (၆) ဖဿပစ္စယာ ဝေဒနာ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 275 | `wf_s8_pyinsii_padatesa_tayar_7` | (၇) ဝေဒနာပစ္စယာ တဏှာ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 276 | `wf_s8_pyinsii_padatesa_tayar_8` | (၈) တဏှာပစ္စယာ ဥပါဒါနံ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 277 | `wf_s8_pyinsii_padatesa_tayar_9` | (၉) ဥပါဒါနပစ္စယာ ဘဝေါ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 278 | `wf_s8_pyinsii_padatesa_tayar_10` | (၁၀) ဘဝပစ္စယာ ဇာတိ | `s8_pyinsii_padatesathamotepat_tayar` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 279 | `wf_s8_pyinsii_padatesa_tayar_11` | (၁၁) ဇာတိပစ္စယာ ဇရာမရဏံ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 280 | `wf_s8_pyinsii_pahtan_6` | ပစ္စည်း အကျဉ်း ၆ မျိုး | `s8_pyinsii_24_summ` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 281 | `wf_s8_pyinsii_pahtan_6_nton` | နာမ်သည် နာမ်အား ကျေးဇူးပြုသော ပစ္စည်း ၆ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 282 | `wf_s8_pyinsii_pahtan_6_ntony` | နာမ်သည် နာမ်ရုပ်အား ကျေးဇူးပြုသော ပစ္စည်း ၅ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 283 | `wf_s8_pyinsii_pahtan_6_ntoyote` | နာမ်သည် ရုပ်အား ကျေးဇူးပြုသော ပစ္စည်း ၁ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 284 | `wf_s8_pyinsii_pahtan_6_yoteton` | ရုပ်သည် နာမ်အား ကျေးဇူးပြုသော ပစ္စည်း ၁ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 285 | `wf_s8_pyinsii_pahtan_6_nypton` | နာမ်၊ ရုပ်၊ ပညတ် တို့သည် နာမ်အား ကျေးဇူးပြုသော ပစ္စည်း ၂ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 286 | `wf_s8_pyinsii_pahtan_6_nytony` | နာမ်ရုပ် ၂ ပါးက နာမ်ရုပ် ၂ ပါးအား ကျေးဇူးပြုကြသော ပစ္စည်း ၉ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 287 | `wf_s8_pyinsii_pahtan_6_how` | ပစ္စည်း ၆ မျိုး တို့၏ ကျေးဇူးပြုပုံများ | `s8_pyinsii_24_summ` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 288 | `wf_s8_pyinsii_pahtan_6_how_nton` | နာမ်သည် နာမ်အား ကျေးဇူးပြုပုံ | `s8_pyinsii_24_summ_how` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 289 | `wf_s8_pyinsii_pahtan_6_how_notony` | နာမ်သည် နာမ်ရုပ်အား ကျေးဇူးပြုပုံ | `s8_pyinsii_24_summ_how` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 290 | `wf_s8_pyinsii_pahtan_6_how_ntoyote` | နာမ်သည် ရုပ်အား ကျေးဇူးပြုပုံ | `s8_pyinsii_24_summ_how` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 291 | `wf_s8_pyinsii_pahtan_6_how_yoteton` | ရုပ်သည် နာမ်အား ကျေးဇူးပြုပုံ | `s8_pyinsii_24_summ_how` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 292 | `wf_s8_pyinsii_pahtan_6_how_nypton` | ပညတ်၊ နာမ်၊ ရုပ်က နာမ်အား ကျေးဇူးပြုပုံ | `s8_pyinsii_24_summ_how` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 293 | `wf_s8_pyinsii_pahtan_6_how_nytony` | နာမ်ရုပ် ၂ ပါးက နာမ်ရုပ် ၂ ပါးအား ကျေးဇူးပြုပုံ | `s8_pyinsii_24_summ_how` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 294 | `wf_s8_pyinsii_pahtan_ppp` | ပစ္စည်း၊ ပစ္စယုပ္ပန်၊ ပစ္စယသတ္တိများ | `s8_pyinsii_24_summ` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 295 | `wf_s8_pyinsii_pahtan_notes` | သိမှတ်ဖွယ်များ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 296 | `wf_s8_pyinsii_pahtan_notes_special` | အထူးမှတ်ဖွယ်များ | `s8_pyinsii_24_summ` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 297 | `wf_s8_pyinsii_pahtan_notes_kala` | ကာလအားဖြင့် ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 298 | `wf_s8_pyinsii_pyinnyat_athta` | အတ္တပညတ် | `s8_pyinnyat` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 299 | `wf_s8_pyinsii_pyinnyat_thatda` | သဒ္ဒပညတ် | `s8_pyinnyat` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 300 | `wf_s8_pyinsii_pahtan_notes_ingar` | အင်္ဂါ ၁၂ ပါး | `s8_pyinsii_padatesa_notes_ingar` / `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 301 | `wf_s8_pyinsii_pahtan_notes_adont` | အဓွန့် ၃ ပါး | `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 302 | `wf_s8_pyinsii_pahtan_notes_achinayar` | အခြင်းအရာ ၂၀ ပါး | `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 303 | `wf_s8_pyinsii_pahtan_notes_ahlwar` | အလွှာ ၄ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 304 | `wf_s8_pyinsii_pahtan_notes_asat` | အစပ် ၃ ပါး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 305 | `wf_s8_pyinsii_pahtan_notes_wott_3` | ဝဋ် ၃ ပါး | `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 306 | `wf_s8_pyinsii_pahtan_notes_wott_2` | ဝဋ်မြစ် ၂ ပါး | `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 307 | `wf_s8_pyinsii_pahtan_notes_cycle` | ပဋိစ္စသမုပ္ပါဒ် လည်ပုံ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 308 | `wf_s8_pyinsii_pahtan_notes_stop` | ပဋိစ္စသမုပ္ပါဒ် ပျက်ကိန်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 309 | `wf_s8_pyinsii_pahtan_notes_awaitza_cause` | အဝိဇ္ဇာ၏ အကြောင်း | `s8_pyinsii_padatesa_notes_awaitza_cause` / `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 310 | `wf_s8_pyinsii_pahtan_notes_anuloma` | အနုလောမ | `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 311 | `wf_s8_pyinsii_pahtan_notes_padiloma` | ပဋိလောမ | `s8_pyinsii_padatesa_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 312 | `wf_s8_pyinsii_pyinnyat_thatda_akyal` | သဒ္ဒပညတ်အကျယ် | `s8_pyinnyat_thatda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 313 | `wf_s8_pyinsii_pyinnyat_thatda_batda` | ဝိဇ္ဇမာန စသည့် ဘဒ္ဒပညတ် ၆ မျိုး | `s8_pyinnyat_thatda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 314 | `wf_s8_pyinsii_pyinnyat_thatda_knowhow` | ပညတ် ၂ မျိုးကိုသိပုံ | `s8_pyinnyat_thatda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 315 | `wf_s9_bawanar` | ဘာဝနာ | `s5_bonne_kan_paka_htarna_karma_kutho_ponya` / `s9` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 316 | `wf_s9_kamhtan` | ကမ္မဋ္ဌာန်း | `s9` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 317 | `wf_s9_thamahta` | သမထကမ္မဋ္ဌာန်း | `s9_kamahtan` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 318 | `wf_s9_wipathanar` | ဝိပဿနာကမ္မဋ္ဌာန်း | `s9_kamahtan` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 319 | `wf_s9_wp_notes` | သိမှတ်ဖွယ်ရာများ | `s4_manaw_appa` / `s4_pyitsa` / `s5_wihtimote` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 320 | `wf_s9_wp_nyans` | ဝိသုဒ္ဓိနှင့် ဝိပဿနာဉာဏ် | `s9_wp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 321 | `wf_s9_wp_ariya_thamapat` | အရိယာပုဂ္ဂိုလ်များနှင့် သမာပတ်များ | `s9_wp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 322 | `wf_s9_thamathan_40` | သမထကမ္မဋ္ဌာန်း ၄၀ | `s9_kamahtan_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 323 | `wf_s9_thatpaya_bayda` | သပ္ပါယဘေဒ | `s9_kamahtan_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 324 | `wf_s9_bawanar_bayda` | ဘာဝနာဘေဒ | `s9_kamahtan_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 325 | `wf_s9_gawsaya_bayda` | ဂေါစရဘေဒ | `s9_kamahtan_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 326 | `wf_s9_kathine_10` | ကသိုဏ်း ၁၀ ပါး | `s9_kamahtan_thamahta_40` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 327 | `wf_s9_athuba_10` | အသုဘ ၁၀ ပါး | `s9_kamahtan_all_kamahtan_analy` / `s9_kamahtan_thamahta_40` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 328 | `wf_s9_anuthadi_10` | အနုဿတိ ၁၀ ပါး | `s9_kamahtan_thamahta_40` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 329 | `wf_s9_apaminya_4` | အပ္ပမညာ ၄ ပါး | `s9_kamahtan_thamahta_40` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 330 | `wf_s9_rhaya_6` | အာဟာရေ ပဋိကူလသညာ၊ စတုဓာတု၀၀တ္ထာန်နှင့် အရုပ္ပ ၄ ပါး | `s9_kamahtan_thamahta_40` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 331 | `wf_s9_thatpaya_6` | စရိုက် ၆ ပါး | `s9_kamahtan_thatpaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 332 | `wf_s9_thatpaya_list` | စရိုက်နှင့် ကမ္မဋ္ဌာန်းကို တွဲစပ်ပုံ | `s9_kamahtan_thatpaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 333 | `wf_s9_bawanar_3` | ဘာဝနာ ၃ ပါး | `s9_kamahtan_bawana_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 334 | `wf_s9_bawanar_analy` | ဘာဝနာဖြင့် ကမ္မဋ္ဌာန်းများကို ဝေဖန်ပုံ | `s9_kamahtan_bawana_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 335 | `wf_s9_bawanar_zen_analy` | ဈာန်တို့ဖြင့် ကမ္မဋ္ဌာန်းများကို ဝေဖန်ပုံ | `s9_kamahtan_bawana_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 336 | `wf_s9_bawanar_bon_analy` | ၃၁ ဘုံ၌ ရနိုင်သော ကမ္မဋ္ဌာန်းများ | `s9_kamahtan_bawana_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 337 | `wf_s9_bawanar_all_analy` | စရိုက်၊ ဘာဝနာ၊ နိမိတ်၊ ဈာန်၊ ဘုံ အားဖြင့် ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 338 | `wf_s9_bawanar_zen_kamahtan` | ဈာန်များ၏ အာရုံ ကမ္မဋ္ဌာန်းများ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 339 | `wf_s9_gawsaya_bayda_3` | နိမိတ် ၃ ပါး | `s9_kamahtan_gawsaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 340 | `wf_s9_gawsaya_bayda_nimate_kamahtan` | နိမိတ်နှင့် ကမ္မဋ္ဌာန်းတွဲစပ်ပုံ | `s9_kamahtan_gawsaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 341 | `wf_s9_gawsaya_bayda_nimate_bawanar` | ဘာဝနာနှင့် နိမိတ်တွဲစပ်ပုံံ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 342 | `wf_s9_gawsaya_bayda_dutiya_how` | ဒုတိယဈာန် စသည် ရအောင် အားထုတ်ပုံ | `s9_kamahtan_gawsaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 343 | `wf_s9_gawsaya_bayda_ayupa_how` | အရူပ္ပဈာန် ရအောင် အားထုတ်ပုံ | `s9_kamahtan_gawsaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 344 | `wf_s9_gawsaya_bayda_abatnyin` | အဘိညာဉ် ၅ ပါး၊ ၆ ပါး၊ ၇ ပါး | `s9_kamahtan_gawsaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 345 | `wf_s9_gawsaya_bayda_wathibaw` | * ဝသိဘော် ၅ ပါး | `s9_kamahtan_gawsaya_bayda` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 346 | `wf_s9_withotedi_7` | ဝိသုဒ္ဓိ ၇ ပါး | `s9_wp_kamahtan_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 347 | `wf_s9_letkana_3` | လက္ခဏာ ၃ ပါး | `s9_wp_kamahtan_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 348 | `wf_s9_anupathanar_3` | အနုပဿနာ ၃ ပါး | `s9_wp_kamahtan_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 349 | `wf_s9_wipatthanar_nyan_10` | ဝိပဿနာဉာဏ် ၁၀ ပါး | `s9_wp_kamahtan_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 350 | `wf_s9_wimawka_3` | ဝိမောက္ခ ၃ ပါး | `s9_wp_kamahtan_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 351 | `wf_s9_wimawka_muka_3` | ဝိမောက္ခမုခ ၃ ပါး | `s9_wp_kamahtan_notes` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 352 | `wf_s9_withotedi_nyansin_steps` | ဝိသုဒ္ဓိနှင့် ဉာဏ် အဆင့်ဆင့် ဖြစ်ပေါ်ပုံ | `s9_wp_withotedi_nyan` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 353 | `wf_s9_withotedi_nyansin_list` | ဝိသုဒ္ဓိ ၇ ပါး နှင့် ဉာဏ်စဉ် ၁၀ ပါး တွဲစပ်ပုံ | `s9_wp_withotedi_nyan` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 354 | `wf_s9_withotedi_nyansin_steps_1` | အဆင့် (၁) သီလဝိသုဒ္ဓိ | `s9_wp_withotedi_nyan_steps` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 355 | `wf_s9_withotedi_nyansin_steps_2` | အဆင့် (၂) စိတ္တဝိသုဒ္ဓိ | `s9_wp_withotedi_nyan_steps` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 356 | `wf_s9_withotedi_nyansin_steps_3` | အဆင့် (၃) ဒိဋ္ဌိဝိသုဒ္ဓိ | `s9_wp_withotedi_nyan_steps` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 357 | `wf_s9_withotedi_nyansin_steps_4` | အဆင့် (၄) ကင်္ခါဝိတရဏ ဝိသုဒ္ဓိ | `s9_wp_withotedi_nyan_steps` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 358 | `wf_s9_withotedi_nyansin_steps_5` | အဆင့် (၅) မဂ္ဂါမဂ္ဂဉာဏ်ဒဿနဝိသုဒ္ဓိ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 359 | `wf_s9_withotedi_nyansin_steps_6` | အဆင့် (၆) ပဋိပဒါဉာဏ်ဒဿနဝိသုဒ္ဓိ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 360 | `wf_s9_withotedi_nyansin_steps_7` | အဆင့် (၇) ဉာဏ်ဒဿနဝိသုဒ္ဓိ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 361 | `wf_s9_withotedi_nyansin_steps_5_clear` | မဂ္ဂါမဂ္ဂဉာဏ်ဒဿနဝိသုဒ္ဓိ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 362 | `wf_s9_withotedi_nyansin_steps_5_thama` | * သမ္မသနဉာဏ် | `s9_wp_withotedi_nyan_steps_5` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 363 | `wf_s9_withotedi_nyansin_steps_5_udaya` | * ဥဒယဗ္ဗယဉာဏ် | `s9_wp_withotedi_nyan_steps_5` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 364 | `wf_s9_withotedi_nyansin_steps_5_upatki_10` | * ဥပက္ကိလေသ ၁၀ ပါး | `s9_wp_withotedi_nyan_steps_5` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 365 | `wf_s9_ariyar` | အရိယာပုဂ္ဂိုလ်များ | `s9_wp_ariya_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 366 | `wf_s9_pala` | ဖလသမာပတ် | `s4_manaw_appa_note` / `s9_wp_ariya_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 367 | `wf_s9_niyawda` | နိရောဓသမာပတ် | `s4_manaw_appa_note` / `s9_wp_ariya_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 368 | `wf_s9_thawtarpan` | သောတာပန် | `s9_wp_ariya_thawtapan` / `s9_wp_ariya` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 369 | `wf_s9_thakdargan` | သကဒါဂါမ် | `s9_wp_ariya_thakadagan` / `s9_wp_ariya` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 370 | `wf_s9_anyargann` | အနာဂါမ် | `s9_wp_ariya_anargan` / `s9_wp_ariya` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 371 | `wf_s9_yahandar` | ရဟန္တာ | `s9_wp_ariya_yahandar` / `s9_wp_ariya` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 372 | `wf_s4_note` | သိမှတ်ဖွယ်ရာများ | `s4_manaw_appa` / `s4_pyitsa` / `s5_wihtimote` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 373 | `wf_s4_pyitsa` | ပဉ္စဒွါရ | `s4_pyitsa` | **EXACT** | wf key and array key are identical after wf_ removal |
| 374 | `wf_s4_manaw` | မနောဒွါရ | `s4_manaw` | **EXACT** | wf key and array key are identical after wf_ removal |
| 375 | `wf_s4_tada_sitt` | တဒါရုံစစ်ခန်း | `s4` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 376 | `wf_s4_zawana` | ဇဝန နိယာမ | `s4_zawana` | **EXACT** | wf key and array key are identical after wf_ removal |
| 377 | `wf_s4_pokegala` | ပုဂ္ဂလဘေဒ | `s4_pokegala` | **EXACT** | wf key and array key are identical after wf_ removal |
| 378 | `wf_s4_bumi` | ဘူမိဝိဘာဂ | `s4_bumi` | **EXACT** | wf key and array key are identical after wf_ removal |
| 379 | `wf_s4_def` | အဓိပ္ပာယ်များ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 380 | `wf_s4_witimote_def` | ဝီထိမုတ်စိတ်များ | `s4_intro_witi_def` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 381 | `wf_s4_bawin_def` | ဘဝင်စိတ်များ | `s4_intro` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 382 | `wf_s4_sasakka` | ဆဆက္က | `s4_intro` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 383 | `wf_s4_witimote_ryone` | ဝီထိမုတ်စိတ် အာရုံထင်ပုံ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 384 | `wf_s4_lifetime` | စိတ်၏အသက်နှင့် ရုပ်၏အသက် | `s4_intro` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 385 | `wf_s4_witi_condition` | ဝီထိဖြစ်ရန် အကြောင်းများ | `s4_intro` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 386 | `wf_s4_sasakka_dwarya` | ဒွါရဆက္က | `s4_pyitsa_garna_1_3` / `s4_pyitsa_garna_2_3` / `s4_pyitsa_garna_3_3` / `s4_pyitsa_garna_4_3` / `s4_pyitsa_karya_1_3` / `s4_pyitsa_karya_2_3` / `s4_pyitsa_karya_3_3` / `s4_pyitsa_karya_4_3` / `s4_pyitsa_satku_1_3` / `s4_pyitsa_satku_2_3` / `s4_pyitsa_satku_3_3` / `s4_pyitsa_satku_4_3` / `s4_pyitsa_thawta_1_3` / `s4_pyitsa_thawta_2_3` / `s4_pyitsa_thawta_3_3` / `s4_pyitsa_thawta_4_3` / `s4_intro_sasatka` / `s4_pyitsa_zeitwa_1_3` / `s4_pyitsa_zeitwa_2_3` / `s4_pyitsa_zeitwa_3_3` / `s4_pyitsa_zeitwa_4_3` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 387 | `wf_s4_sasakka_aryamana` | အာရမ္မဏဆက္က | `s4_pyitsa_garna_1_3` / `s4_pyitsa_garna_2_3` / `s4_pyitsa_garna_3_3` / `s4_pyitsa_garna_4_3` / `s4_pyitsa_karya_1_3` / `s4_pyitsa_karya_2_3` / `s4_pyitsa_karya_3_3` / `s4_pyitsa_karya_4_3` / `s4_pyitsa_satku_1_3` / `s4_pyitsa_satku_2_3` / `s4_pyitsa_satku_3_3` / `s4_pyitsa_satku_4_3` / `s4_pyitsa_thawta_1_3` / `s4_pyitsa_thawta_2_3` / `s4_pyitsa_thawta_3_3` / `s4_pyitsa_thawta_4_3` / `s4_intro_sasatka` / `s4_pyitsa_zeitwa_1_3` / `s4_pyitsa_zeitwa_2_3` / `s4_pyitsa_zeitwa_3_3` / `s4_pyitsa_zeitwa_4_3` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 388 | `wf_s4_sasakka_wittu` | ဝတ္ထုဆက္က | `s4_pyitsa_garna_1_3` / `s4_pyitsa_garna_2_3` / `s4_pyitsa_garna_3_3` / `s4_pyitsa_garna_4_3` / `s4_pyitsa_karya_1_3` / `s4_pyitsa_karya_2_3` / `s4_pyitsa_karya_3_3` / `s4_pyitsa_karya_4_3` / `s4_pyitsa_satku_1_3` / `s4_pyitsa_satku_2_3` / `s4_pyitsa_satku_3_3` / `s4_pyitsa_satku_4_3` / `s4_pyitsa_thawta_1_3` / `s4_pyitsa_thawta_2_3` / `s4_pyitsa_thawta_3_3` / `s4_pyitsa_thawta_4_3` / `s4_intro_sasatka` / `s4_pyitsa_zeitwa_1_3` / `s4_pyitsa_zeitwa_2_3` / `s4_pyitsa_zeitwa_3_3` / `s4_pyitsa_zeitwa_4_3` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 389 | `wf_s4_sasakka_weitnyar` | ဝိညာဏဆက္က | `s4_pyitsa_garna_1_3` / `s4_pyitsa_garna_2_3` / `s4_pyitsa_garna_3_3` / `s4_pyitsa_garna_4_3` / `s4_pyitsa_karya_1_3` / `s4_pyitsa_karya_2_3` / `s4_pyitsa_karya_3_3` / `s4_pyitsa_karya_4_3` / `s4_pyitsa_satku_1_3` / `s4_pyitsa_satku_2_3` / `s4_pyitsa_satku_3_3` / `s4_pyitsa_satku_4_3` / `s4_pyitsa_thawta_1_3` / `s4_pyitsa_thawta_2_3` / `s4_pyitsa_thawta_3_3` / `s4_pyitsa_thawta_4_3` / `s4_intro_sasatka` / `s4_pyitsa_zeitwa_1_3` / `s4_pyitsa_zeitwa_2_3` / `s4_pyitsa_zeitwa_3_3` / `s4_pyitsa_zeitwa_4_3` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 390 | `wf_s4_sasakka_witi` | ဝီထိဆက္က | `s4_pyitsa_garna_1_3` / `s4_pyitsa_garna_2_3` / `s4_pyitsa_garna_3_3` / `s4_pyitsa_garna_4_3` / `s4_pyitsa_karya_1_3` / `s4_pyitsa_karya_2_3` / `s4_pyitsa_karya_3_3` / `s4_pyitsa_karya_4_3` / `s4_pyitsa_satku_1_3` / `s4_pyitsa_satku_2_3` / `s4_pyitsa_satku_3_3` / `s4_pyitsa_satku_4_3` / `s4_pyitsa_thawta_1_3` / `s4_pyitsa_thawta_2_3` / `s4_pyitsa_thawta_3_3` / `s4_pyitsa_thawta_4_3` / `s4_intro_sasatka` / `s4_pyitsa_zeitwa_1_3` / `s4_pyitsa_zeitwa_2_3` / `s4_pyitsa_zeitwa_3_3` / `s4_pyitsa_zeitwa_4_3` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 391 | `wf_s4_sasakka_withaya` | ဝိသယပ္ပဝတ္တိဆက | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 392 | `wf_s4_pyitsa_75` | ဝီထိ ၇၅ ပါး | `s4_pyitsa_75` | **EXACT** | wf key and array key are identical after wf_ removal |
| 393 | `wf_s4_pyitsa_example` | ဥပမာ | `s4_pyitsa_example` | **EXACT** | wf key and array key are identical after wf_ removal |
| 394 | `wf_s4_analy` | သရုပ် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 395 | `wf_s4_depend` | မှီရာ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 396 | `wf_s4_sasakka_analys` | ဆဆက္ကဖြင့် ဝေဖန်ခြင်း | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 397 | `wf_s4_pyitsa_sakku` | စက္ခုဒွါရ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 398 | `wf_s4_pyitsa_thawta` | သောတဒွါရ | `s4_pyitsa_thawta` | **EXACT** | wf key and array key are identical after wf_ removal |
| 399 | `wf_s4_pyitsa_garna` | ဃာနဒွါရ | `s4_pyitsa_garna` | **EXACT** | wf key and array key are identical after wf_ removal |
| 400 | `wf_s4_pyitsa_zeitwar` | ဇိဝှာဒွါရ | `s3_dwarya_6` / `s4_intro_sasatka_dwarya_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 401 | `wf_s4_pyitsa_karya` | ကာယဒွါရ | `s4_pyitsa_karya` | **EXACT** | wf key and array key are identical after wf_ removal |
| 402 | `wf_s4_pyitsa_ati_mahan_s` | အတိမဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 403 | `wf_s4_pyitsa_mahan_s` | မဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 404 | `wf_s4_pyitsa_paratta_s` | ပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 405 | `wf_s4_pyitsa_ati_parat_s` | အတိပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 406 | `wf_s4_pyitsa_ati_mahan_th` | အတိမဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 407 | `wf_s4_pyitsa_mahan_th` | မဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 408 | `wf_s4_pyitsa_paratta_th` | ပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 409 | `wf_s4_pyitsa_ati_parat_th` | အတိပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 410 | `wf_s4_pyitsa_ati_mahan_ga` | အတိမဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 411 | `wf_s4_pyitsa_mahan_ga` | မဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 412 | `wf_s4_pyitsa_paratta_ga` | ပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 413 | `wf_s4_pyitsa_ati_parat_ga` | အတိပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 414 | `wf_s4_pyitsa_ati_mahan_z` | အတိမဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 415 | `wf_s4_pyitsa_mahan_z` | မဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 416 | `wf_s4_pyitsa_paratta_z` | ပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 417 | `wf_s4_pyitsa_ati_parat_z` | အတိပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 418 | `wf_s4_pyitsa_ati_mahan_k` | အတိမဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 419 | `wf_s4_pyitsa_mahan_k` | မဟန္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 420 | `wf_s4_pyitsa_paratta_k` | ပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 421 | `wf_s4_pyitsa_ati_parat_k` | အတိပရိတ္တာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 422 | `wf_s4_wibu` | ဝိဘူတာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 423 | `wf_s4_awibu` | အဝိဘူတာရုံ | `s4_intro_sasatka_wipatthayapatwatti_6` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 424 | `wf_s4_pyitsa_witi_how` | ဝီထိဖြစ်ပုံ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 425 | `wf_s4_manaw_kama` | ကာမဇောဝါရ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 426 | `wf_s4_manaw_appa` | အပ္ပနာဇောဝါရ | `s4_manaw_appa` | **EXACT** | wf key and array key are identical after wf_ removal |
| 427 | `wf_s4_dipani` | ပရမတ္ထဒီပနီ အလို | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 428 | `wf_s4_tada_wita` | တဒနုဝတ္တကမနောဒွါရ ဝီထိ | `s4_manaw_kamazaw` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 429 | `wf_s4_manaw_appa_note` | သိမှတ်ဖွယ်ရာများ | `s4_manaw_appa_note` | **EXACT** | wf key and array key are identical after wf_ removal |
| 430 | `wf_s4_manaw_appa_lawki` | လောကီ | `s4_manaw_appa_lawki` | **EXACT** | wf key and array key are identical after wf_ removal |
| 431 | `wf_s4_manaw_appa_lawkote` | လောကုတ္တရာ | `s4_manaw_appa_lawkote` | **EXACT** | wf key and array key are identical after wf_ removal |
| 432 | `wf_s4_manaw_appa_note_witi_how` | ဝီထိဖြစ်ပုံ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 433 | `wf_s4_manaw_appa_note_pyitnya_person` | မန္ဒနှင့် တက္ခပည ပုဂ္ဂိုလ် | `s4_manaw_appa_note` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 434 | `wf_s4_manaw_appa_note_upasarya` | ဥပစာရသမာဓိဇော | `s4_manaw_appa_note` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 435 | `wf_s4_manaw_appa_note_zarna_thamapat` | ဈာနသမာပတ် | `s4_manaw_appa_note` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 436 | `wf_s4_manaw_appa_note_pala_thamapat` | ဖလသမာပတ် | `s4_manaw_appa_note` / `s9_wp_ariya_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 437 | `wf_s4_manaw_appa_note_niyawda_thamapat` | နိရောဓသမာပတ် | `s4_manaw_appa_note` / `s9_wp_ariya_title` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 438 | `wf_s4_manaw_appa_lawki_zarna` | ဈာနဝီထိ | `s4_manaw_appa_lawki` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 439 | `wf_s4_manaw_appa_lawki_abainyar` | အဘိညာဝီထိ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 440 | `wf_tada_sitt_3` | တဒါရုံ ဖြစ်ကြောင်း အင်္ဂါ ၃ ပါး | `s4_manaw_tadayone` / `s4_manaw_tadayone_3` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 441 | `wf_tada_sitt_wipat_niyarma` | ဝိပါကနိယာမ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 442 | `wf_tada_sitt_zaw_right` | ဇောအမှန် | `s4_manaw_tadayone` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 443 | `wf_tada_sitt_zaw_wrong` | ဇောအပြန် | `s4_manaw_tadayone` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 444 | `wf_tada_sitt_zaw_tadaryon` | ကာမဇောနောင် တဒါရုံ ဖြစ်ပုံ | `s4_manaw_tadayone` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 445 | `wf_tada_sitt_tadaryon_zaw` | တဒါရုံရှေ့ ကာမဇော စောပုံ | `s4_manaw_tadayone` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 446 | `wf_tada_sitt_temp_bawin` | အာဂနု္တက ဘဝင် | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 447 | `wf_s4_zawana_kama` | ကာမဇော | `s4_zawana_kama` | **EXACT** | wf key and array key are identical after wf_ removal |
| 448 | `wf_s4_zawana_appana` | အပ္ပနာဇော | `s4_zawana_appana` | **EXACT** | wf key and array key are identical after wf_ removal |
| 449 | `wf_s4_zawana_naung` | ကာမတိဟိတ်ဇော နောင် အပ္ပနာဇောနှောင်းပုံ | `s4_zawana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 450 | `wf_s4_zawana_naung_waydanar` | ဝေဒနာပေါ် မူတည်၍ | `s4_zawana_kama_next_appana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 451 | `wf_s4_zawana_naung_person` | ပုဂ္ဂိုလ်ပေါ် မူတည်၍ | `s4_zawana_kama_next_appana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 452 | `wf_s4_zawana_naung_waydanar_zat` | ဝေဒနာနှင့် ဇာတ်တို့ကို မူတည်၍ | `s4_zawana_kama_next_appana` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 453 | `wf_s4_zawana_naung_person_thitka` | သေက္ခ၊ အသေက္ခ မူတည်၍ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 454 | `wf_s4_zawana_naung_person_tihate` | တိဟိတ်ပုဂ္ဂိုလ်ပေါ် မူတည်၍ | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 455 | `wf_s4_pokegala_12` | ပုဂ္ဂိုလ် ၁၂ ဦး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 456 | `wf_s4_pokegala_bon_person` | ဘုံပုဂ္ဂိုလ်ရ | `s4_pokegala_bon_person` | **EXACT** | wf key and array key are identical after wf_ removal |
| 457 | `wf_s4_pokegala_person_bon` | ပုဂ္ဂိုလ်ဘုံရ | `s4_pokegala_person_bon` | **EXACT** | wf key and array key are identical after wf_ removal |
| 458 | `wf_s4_pokegala_person_sate` | ပုဂ္ဂိုလ်စိတ်ရ | `s4_pokegala_person_sate` | **EXACT** | wf key and array key are identical after wf_ removal |
| 459 | `wf_s4_pokegala_12_4` | ပုထုဇဉ် ၄ ဦး | `s4_pokegala_person` / `s4_pokegala_person_mm` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 460 | `wf_s4_pokegala_12_8` | အရိယာ ၈ ဦး | — | **UNRESOLVED** | no direct key or label-to-array evidence |
| 461 | `wf_s4_pokegala_12_note` | မှတ်သားဖွယ်ရာများ | `s4_pokegala_person` / `s4_pokegala_person_mm` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 462 | `wf_s4_pokegala_12_8_magg` | မဂ္ဂဋ္ဌာန် ၄ ဦး | `s4_pokegala_person_ariya` / `s4_pokegala_person_ariya_note` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 463 | `wf_s4_pokegala_12_8_pho` | ဖလဋ္ဌာန် ၄ ဦး | `s4_pokegala_person_ariya` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 464 | `wf_s4_pokegala_person_sate_kama_1` | ကာမဘုံ ပုထုဇဉ်ပုဂ္ဂိုလ် စိတ်ရ | `s4_pokegala_person_sate_kama_1` | **EXACT** | wf key and array key are identical after wf_ removal |
| 465 | `wf_s4_pokegala_person_sate_kama_2` | ကာမဘုံ အရိယာများ စိတ်ရ | `s4_pokegala_person_sate_kama_2` | **EXACT** | wf key and array key are identical after wf_ removal |
| 466 | `wf_s4_pokegala_person_sate_yupa` | ရူပပုဂ္ဂိုလ်တို့ စိတ်ရ | `s4_pokegala_person_sate_yupa` | **EXACT** | wf key and array key are identical after wf_ removal |
| 467 | `wf_s4_pokegala_person_sate_ayupa` | အရူပပုဂ္ဂိုလ်တို့ စိတ်ရ | `s4_pokegala_person_sate_ayupa` | **EXACT** | wf key and array key are identical after wf_ removal |
| 468 | `wf_s4_manaw_appa_note_abaitnyin` | အဘိညာဉ် ၅ ပါး | `s4_manaw_appa_note_abaitnyin` | **EXACT** | wf key and array key are identical after wf_ removal |
| 469 | `wf_s8_pyinsii_pahtan_ppp_1` | ဟေတုပစ္စယော | `s8_pyinsii_24_ppp_1` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 470 | `wf_s8_pyinsii_pahtan_ppp_2` | အာရမ္မဏပစ္စယော | `s8_pyinsii_24_ppp_2` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 471 | `wf_s8_pyinsii_pahtan_ppp_3` | အဓိပတိပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 472 | `wf_s8_pyinsii_pahtan_ppp_4` | အနန္တရ ပစ္စယော | `s8_pyinsii_24_ppp_4` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 473 | `wf_s8_pyinsii_pahtan_ppp_5` | သမနန္တရပစ္စယော | `s8_pyinsii_24_ppp_5` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 474 | `wf_s8_pyinsii_pahtan_ppp_6` | သဟဇာတပစ္စယော | `s8_pyinsii_24_ppp_6` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 475 | `wf_s8_pyinsii_pahtan_ppp_7` | အညမညပစ္စယော | `s8_pyinsii_24_ppp_7` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 476 | `wf_s8_pyinsii_pahtan_ppp_8` | နိဿယပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 477 | `wf_s8_pyinsii_pahtan_ppp_9` | ဥပနိဿယပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 478 | `wf_s8_pyinsii_pahtan_ppp_10` | ပုရေဇာတပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 479 | `wf_s8_pyinsii_pahtan_ppp_11` | ပစ္ဆာဇာတပစ္စယော | `s8_pyinsii_24_ppp_11` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 480 | `wf_s8_pyinsii_pahtan_ppp_12` | အာသေဝနပစ္စယော | `s8_pyinsii_24_ppp_12` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 481 | `wf_s8_pyinsii_pahtan_ppp_13` | ကမ္မပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 482 | `wf_s8_pyinsii_pahtan_ppp_14` | ဝိပါကပစ္စယော | `s8_pyinsii_24_ppp_14` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 483 | `wf_s8_pyinsii_pahtan_ppp_15` | အာဟာရပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 484 | `wf_s8_pyinsii_pahtan_ppp_16` | က္ကုန္ဒြိယပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 485 | `wf_s8_pyinsii_pahtan_ppp_17` | ဈာနပစ္စယော | `s8_pyinsii_24_ppp_17` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 486 | `wf_s8_pyinsii_pahtan_ppp_18` | မဂ္ဂပစ္စယော | `s8_pyinsii_24_ppp_18` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 487 | `wf_s8_pyinsii_pahtan_ppp_19` | သမ္ပယုတ္တပစ္စယော | `s8_pyinsii_24_ppp_19` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 488 | `wf_s8_pyinsii_pahtan_ppp_20` | ဝိပ္ပယုတ္တပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 489 | `wf_s8_pyinsii_pahtan_ppp_21` | အတ္ထိပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 490 | `wf_s8_pyinsii_pahtan_ppp_22` | နတ္ထိပစ္စယော | `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 491 | `wf_s8_pyinsii_pahtan_ppp_23` | ဝိဂတပစ္စယော | `s8_pyinsii_24_ppp_23` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |
| 492 | `wf_s8_pyinsii_pahtan_ppp_24` | အဝိဂတပစ္စယော | `s8_pyinsii_24_ppp_24` / `s8_pyinsii_24_ppp` | **PARTIAL** | label text matches recovered array item(s); runtime dispatch not proven |

## Current conclusion

All **492 navigation labels are accounted for as records**. This closes the **inventory/accounting** part of the navigation gate.

The remaining gap is not missing labels; it is **runtime proof**: exact menu dispatch, parent/child expansion, shared-array reuse, and screen transition behavior. Those must remain PARTIAL/UNRESOLVED until APK/DEX runtime evidence is decoded.

## Safety

Do not use this matrix to rewrite source content. Do not deduplicate arrays. Do not promote PARTIAL/UNRESOLVED relationships to EXACT without additional evidence.