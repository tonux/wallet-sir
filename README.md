# Projet GL SIR SOIR 2022

## Introduction
Projet de développement logiciel utilisant l'intégration continue (CI), la livraison continue (CD), Sonar, Jenkins, Docker et Kubernetes, en se basant sur une application Spring Boot existante sur GitHub

## Description du projet
- Faire un Fork de l'application Spring Boot existante sur GitHub et configurer un environnement de développement en utilisant Docker et Kubernetes.
lien du projet :

- Configurez Jenkins pour exécuter des tests automatisés et des analyses de code à chaque commit dans le dépôt Git. Utilisez Sonar pour analyser la qualité du code et détecter les problèmes potentiels, tels que les bogues et les vulnérabilités de sécurité. L’image générée devra être envoyée à l’aide de jenkins sur le docker Hub

- Développez de nouvelles fonctionnalités pour l'application en suivant une approche de livraison continue, en effectuant de petites livraisons fréquentes plutôt que de grandes livraisons moins fréquentes. Utilisez Jenkins et Kubernetes pour déployer automatiquement l'application dans un environnement de test à chaque fois qu'elle est mise à jour.

Nb: vous pouvez utiliser votre environnement local.

- Assurez-vous que la couverture de code de l'application atteint au moins 80% en ajoutant de nouveaux tests automatisés pour couvrir les nouvelles fonctionnalités développées.

- Compléter l'automatisation de scénarios avec Cucumber/Gherkin en ajoutant le code Java. ( voir scénario ci dessous)

- Ajouter la documentation avec Swagger

- Testez l'application dans l'environnement de test en utilisant des tests automatisés et des tests manuels. Si l'application passe les tests, utilisez Jenkins et Kubernetes pour déployer automatiquement l'application dans un environnement de production.

- Générez un rapport décrivant les différentes étapes du projet, y compris les analyses de code et les tests effectués, ainsi que les résultats obtenus. Le rapport devrait également inclure des informations sur les améliorations apportées à l'application et sur les problèmes rencontrés et comment ils ont été résolus.

### Scenario Cucumber Wallet API
```gherkin
Feature: Wallet API
  As a fintech developer
  I want to test the Wallet API
  So that I can ensure it is working correctly

Scenario: Create wallet
  Given a wallet with name "My Wallet" and balance 100
  When I POST the wallet to the "/wallets" endpoint
  Then the response status should be 201
  And the response body should contain the wallet

Scenario: Get wallet
  Given a wallet with ID 1 and name "My Wallet" and balance 100
  When I GET the wallet from the "/wallets/1" endpoint
  Then the response status should be 200
  And the response body should contain the wallet

Scenario: Update wallet
  Given a wallet with ID 1 and name "My Wallet" and balance 100
  When I PUT the wallet to the "/wallets/1" endpoint with name "Updated Wallet" and balance 200
  Then the response status should be 200
  And the response body should contain the updated wallet

Scenario: Delete wallet
  Given a wallet with ID 1 and name "My Wallet" and balance 100
  When I DELETE the wallet from the "/wallets/1" endpoint
  Then the response status should be 204
  And the wallet should not be retrievable

```

### Scenario Cucumber Transaction API
```gherkin
Feature: Transaction API
  As a fintech developer
  I want to test the Transaction API
  So that I can ensure it is working correctly

Scenario: Transfer funds
  Given a wallet with ID 1 and name "My Wallet" and balance 100
  And a wallet with ID 2 and name "Other Wallet" and balance 50
  When I POST a transaction with wallet ID 1 and amount 50 and type "transfer" to the "/transactions" endpoint
  Then the response status should be 201
  And the wallet with ID 1 should have a balance of 50
  And the wallet with ID 2 should have a balance of 100

Scenario: Deposit funds
  Given a wallet with ID 1 and name "My Wallet" and balance 100
  When I POST a transaction with wallet ID 1 and amount 50 and type "deposit" to the "/transactions" endpoint
  Then the response status should be 201
  And the wallet with ID 1 should have a balance of 150

Scenario: Withdraw funds
  Given a wallet with ID 1 and name "My Wallet" and balance 100
  When I POST a transaction with wallet ID 1 and amount 50 and type "withdraw" to the "/transactions" endpoint
  Then the response status should be 201
  And the wallet with ID 1 should have a balance of 50
```


## Livrables
- Rapport sous format PDF
- Lien github du projet
- Lien docker hub pour voir l’image envoyée

mail: sambndongo@gmail.com

## Spécificité sur le projet
Le travail sera effectué sous forme de groupe de 3 étudiants.

La date limite de livraison sera le 22 Janvier 2023 à 23h:59mn.

NB: Ce délai dépassé des pénalités sur la note s’appliquera.



### credentials à utiliser 
1 - sonar
```json
{
  "port": "9000"
  "username": "admin",
  "password": "admin123"
}
```

2 - dockerhub
```json
{
  "username": "sirsoir2022",
  "password": "sirsoir2022"
}
```
repository : le groupe+numéro ( exemple: groupe1)



## Notation:
- Completer les tests ( unitaires et cucumber) et la couverture : 5pts
- CI/CD avec Jenkins- Sonar - Docker - Kubernetes :  8pts
- Rédaction document 7pts


Notes :
Pour les utiisateurs de Mac si vous avez un souci avec les commande dockers sur jenkins voir ici https://harshityadav95.medium.com/how-to-setup-docker-in-jenkins-on-mac-c45fe02f91c5

Bonne chance
