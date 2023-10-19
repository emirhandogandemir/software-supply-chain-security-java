
# Software Bill of Materials (SBOM) Scanning in Maven Project
For our Java-based Maven project, we've generated the Software Bill of Materials (SBOM) using two prevalent formats: SPDX (Software Package Data Exchange) and CycloneDX. Below is a guide on how to inspect and analyze these SBOMs within our Maven environment.

## Prerequisites:
Ensure you've integrated the necessary Maven plugins and dependencies for parsing both the SPDX and CycloneDX formats.

## Steps for Scanning the SBOM:
### 1. SPDX Format in Maven:
If you haven't incorporated an SPDX Maven plugin or related dependency, consider adding it to your pom.xml.

### 2. CycloneDX Format in Maven:
Should you not have a CycloneDX Maven plugin or dependency, integrate it into your pom.xml.

### 3. Review results
After completing the Maven command execution, delve into the generated outputs. Our project's SBOM can be discerned in the xxx.json file. Scrutinize this document to ensure all Java components and dependencies within the SBOM correspond with those itemized in your pom.xml, and they remain up-to-date and secure.
