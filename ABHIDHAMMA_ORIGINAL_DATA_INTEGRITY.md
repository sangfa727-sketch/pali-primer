# Abhidhamma Original Data Integrity Manifest

## Scope

This manifest freezes the currently verified original-data identity for the source application. It covers source identity and recovered resource content. It does not claim runtime/navigation reconstruction.

## Original application

- Package: `org.dhammadarna.abhidhamma_myanmar`
- Version: `1.2`
- Source language: Myanmar Unicode
- Source resource: Android `resources.arsc`

## Verified content inventory

- Strings: 512
- String arrays: 705
- Total array items: 5,398
- Navigation labels (`wf_*`): 492
- Burmese content: approximately 420,000 characters
- Section prefixes: s0–s9
- Shared/variant arrays are retained as distinct source identities.

## Source identities

- Recovered content artifact: `abhidhamma_content.min.json`
- Content artifact SHA-1: `64181dd75f31186216f6276351d793511ba78922`
- Original `resources.arsc` SHA-1: `4d6a01bf7d9fc77b89fc24dfba8c3d451edb3e1b`
- Original `classes.dex` SHA-1: `12767bbc1d80d7ddfa88071c6eda694ea8fc88e7`
- Original APK in recovery branch: `Abhidhamma.apk`
- Original APK SHA-1: `f28bbc62ec62c39a8194157db207817c9a3ced20`
- Original APK size: 4,513,879 bytes
- Original DEX size: 1,658,392 bytes
- Original resources.arsc size: 1,269,092 bytes

## Integrity rules

1. Original resource keys are preserved.
2. Original array item order is preserved.
3. Duplicate-looking arrays are not deduplicated.
4. No external Abhidhamma text is substituted for recovered source content.
5. Literal line breaks and Burmese numbering are preserved.
6. Source variants such as `_1`, `_2`, `_3`, `_4`, `_mm` remain separate identities.
7. Runtime relationships are not inferred from content-key similarity alone.

## Boundary

**Original-data content recovery is treated as complete at the inventory/content-identity layer represented by this manifest.**

This does **not** close navigation, exact hierarchy, or runtime/UI gates. Those remain separate evidence gates and require runtime/binary inspection where the surviving connector-accessible evidence is insufficient.

## Evidence limitation

The GitHub connector can verify binary existence, size, and SHA-1 for the original APK/DEX/resources but cannot currently return their binary bytes for local decoding. Therefore this manifest intentionally makes no claim about runtime navigation behavior.
