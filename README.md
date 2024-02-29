# Modélisation des véhicules

Ce dépôt contient une modélisation de différents types de véhicules en respectant les contraintes et les spécifications suivantes :

## Types de véhicules

1. Voiture électrique
2. Voiture hybride
3. Voiture diesel
4. Voiture essence

## Caractéristiques communes des véhicules

- Marque
- Kilométrage
- Modèle
- Autonomie maximale
- Liste de pneus
- Nombre de chevaux fiscaux

## Types de pneus

1. Pneu été
2. Pneu hiver
3. Pneu toute saison

## Caractéristiques communes des pneus

- Marque
- Largeur du pneu en mm
- Indice de capacité de charge
- Date de production
- Indice d'adhérence

## Contraintes

- L'autonomie des véhicules varie en fonction de leur catégorie :
  - Véhicules électriques : jusqu'à 500 km sans recharge.
  - Véhicules diesel et essence : jusqu'à 1000 km.
  - Véhicules hybrides : autonomie de 800 km.
- Les pneus hiver ne peuvent pas être équipés sur des véhicules électriques.
- Un véhicule hybride ne peut être équipé que de pneus toute saison.
- Les pneus hiver ont une adhérence comprise entre 0.7 et 1 inclus.
- Les pneus été ont une adhérence comprise entre 0.4 et 0.7 (non inclus).
- Les pneus toute saison ont une adhérence entre 0.1 et 0.4 (non inclus).
- Un véhicule doit être équipé de 4 pneus.

## Méthodes d'ajout

Dans les constructeurs d'objets, seuls les types primitifs seront initialisés. Pour les autres éléments, des méthodes d'ajout seront créées. Par exemple, une méthode "addPneu" pourrait être créée, prenant un pneu en paramètre et l'ajoutant à l'objet véhicule.

## Conseils pour la réalisation

- Apportez des ajouts à vos classes en incluant des contraintes ou des attributs définissant leur comportement.
- Ajoutez des commentaires pour expliquer vos choix et vos initiatives.
- Réalisez une modélisation approfondie pour gagner des points supplémentaires.

## Gestion des exceptions

La gestion des exceptions est essentielle lors de l'ajout de contraintes. Il est important de prendre en compte les éventuelles erreurs et de les gérer correctement. Vous devrez créer une classe de test dans laquelle vous modéliserez chaque type de véhicule, en prenant soin de gérer les exceptions de manière appropriée.

---

N'hésitez pas à explorer le code pour comprendre la modélisation des véhicules et des pneus, ainsi que la gestion des exceptions. Amusez-vous bien à coder !
