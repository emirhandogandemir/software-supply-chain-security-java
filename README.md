# Software-supply-chain-security-java
This repo contains articles, videos, and resources on software supply chain security that I came across during my research. Below, you can first see the architecture of the project to be implemented and access the detailed technology stack through the links.

🔗 GitHub Links
| Proje Adı    | Açıklama    | GitHub Linki                           |
|--------------|-------------|----------------------------------------|
| Awesome software supply chain security      | A compilation of resources in the software supply chain security domain, with emphasis on open source | [awesome-software-supply-chain-security](https://github.com/bureado/awesome-software-supply-chain-security)  |
| Proje 2      | Açıklama 2  | [GitHub Proje 2](https://github.com/)  |
| Proje 3      | Açıklama 3  | [GitHub Proje 3](https://github.com/)  |
| Proje 4      | Açıklama 4  | [GitHub Proje 4](https://github.com/)  |

------------------------------------------------------------------------------

🎥 Videos
| Başlık       | Yükleyen    | Yayın Tarihi | İzlenme Sayısı |
|--------------|-------------|--------------|----------------|
| [Securing the Supply Chain for Your Java Applications By Thomas Vitale](https://youtu.be/ftPFxK8JPNM?si=SZRjqNARzj1GJaam)    | [Devoxx](https://youtube.com/@DevoxxForever?si=L_YwGLhn7japl-bb)    | 06.10.2023   | 500+          |
| Video 2      | Kanal 2     | 02.01.2023   | 500+           |
| Video 3      | Kanal 3     | 03.01.2023   | 2000+          |
| Video 4      | Kanal 4     | 04.01.2023   | 300+           |

------------------------------------------------------------------------------

📝 Article
| Başlık       | Yazar       | Yayın Tarihi | Değerlendirme |
|--------------|-------------|--------------|---------------|
| [Supply Chain Security](https://www.aquasec.com/cloud-native-academy/supply-chain-security/supply-chain-security-mitigating-the-supply-chain-threat/)       | aqua     | None   | ⭐⭐⭐⭐⭐    |
| [How to create SBOMs in Java with Maven and Gradle](https://medium.com/@snyksec/how-to-create-sboms-in-java-with-maven-and-gradle-2abb1269baa6)       | snyk     | 28.11.2022   | ⭐⭐⭐⭐       |
| [SBOM Quick Start](https://help.sonatype.com/iqserver/quickstart-guides/software-bill-of-materials-%28sbom%29-quick-start?selectedPageVersions=6&selectedPageVersions=7)       | Sonatype     | None   | ⭐⭐⭐⭐     |
| Yazı 4       | Yazar 4     | 04.01.2023   | ⭐⭐⭐           |

--------------------------------------------------------------------------------

👤 LinkedIn Profiles to Follow
| Name           | Title               | Profile Link                        |
|----------------|----------------------|------------------------------------|
| Person 1       | Position 1          | [LinkedIn Profile 1](https://www.linkedin.com/) |
| Person 2       | Position 2          | [LinkedIn Profile 2](https://www.linkedin.com/) |
| Person 3       | Position 3          | [LinkedIn Profile 3](https://www.linkedin.com/) |
| Person 4       | Position 4          | [LinkedIn Profile 4](https://www.linkedin.com/) |


--------------------------------------
## Dependency Track 

`Installed with docker-compose.yaml`

![image](https://github.com/emirhandogandemir/software-supply-chain-security-java/assets/74687192/4db8ff3b-6c49-499b-b705-bb69a9e1af6c)

![image](https://github.com/emirhandogandemir/software-supply-chain-security-java/assets/74687192/a77ad6f6-4445-4097-8778-2852e1e8dae6)

![image](https://github.com/emirhandogandemir/software-supply-chain-security-java/assets/74687192/e387a3f0-d3cb-4117-b37c-a2a7e1594322)

## Sonarqube

- `docker pull sonarqube:communition`
- `docker run -d --name sonarqube -p 9000:9000 -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -e SONAR_JAVA_OPTS="-Xmx4g -Xms512m -XX:+HeapDumpOnOutOfMemoryError" sonarqube:community`

We can use below command for project SCA 

`mvn clean package sonar:sonar -Dsonar.projecKey=secure-devOps -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqa_8d5781d430cef6f2ba2c08e691ef6b01bd0c8f28 -Dsonar.exclusions=**/*.java` this login token will be changing because of this sonarqube does not persistent

![image](https://github.com/emirhandogandemir/software-supply-chain-security-java/assets/74687192/a2576664-7c8f-45f6-8cc7-734446a19e15)

![image](https://github.com/emirhandogandemir/software-supply-chain-security-java/assets/74687192/11d5e107-f421-460c-a88d-912dadcead96)

![image](https://github.com/emirhandogandemir/software-supply-chain-security-java/assets/74687192/de7bba07-253e-4eb1-8792-4b1b19762d19)


## Buildpacks
We will creating a image with buildpacks
[Buildpacks](https://buildpacks.io/)


## Jıb-Maven-Plugin

- [How to use jib with our java project](https://github.com/GoogleContainerTools/jib/blob/master/jib-maven-plugin/README.md)
- `mvn clean install -P create-image`
----------------------------------------------------------------------------------------

### [After this step we will be working on killercoda](https://killercoda.com/kubernetes/scenario/playground)

## Trivy

- [How to install trivy](https://aquasecurity.github.io/trivy/v0.18.3/installation/)
- `trivy image dogandemir51/secure:0.0.1`
- `trivy image --format json --output trivy-scanning.json dogandemir51/secure:0.0.1`

## Helm
- [helm](https://helm.sh/)
- `helm create securechart`
- You must change values.yaml for your application
- `helm install secure ./securechart`

## Cosign 




## Kyverno



