# JavaRepository
Instruction 10 :
Lorsque la méthode addAnimal(tn.esprit.gestionzoo.entities.Animal animal) est utilisée pour ajouter des animaux au zoo, si le nombre total d'animaux dépasse la capacité maximale du zoo
l'ajout échoue.
En conséquence, la méthode retourne false, indiquant qu'il n'est plus possible d'ajouter d'autres animaux

Instruction 11:
1)La méthode retourne l'indice de l'animal s'il est trouvé, sinon elle retourne -1
2)La méthode retourne l'indice du premier animal trouvé.

Instruction 12 :
on fait un controle d'ajout ou  L'animal ne peut être ajouté qu'une seule fois dans le zoo.
Le nombre total d'animaux ne peut pas dépasser le nombre maximal d'animaux autorisés (défini par nbrCages).

Instruction 18 :
on fait une condition dans la main si le name <> null on ajoute les animaus au zoo pour eviter "Cannot store to object array because "this.animals" is null
at tn.esprit.gestionzoo.entities.Zoo.addAnimal(Zoo.java:106)
at tn.esprit.gestionzoo.main.Main.main(Main.java:45)"

Instruction 22 : toutes les valeurs de types string etaient null et les int sont à 0 et les booleans sont false par defaut mais 
apres les constructeurs paramétres la methode toString affichent toutes les valeurs de chaque instance deja initialisées dans le constructeur

Instruction 24 : le penguin herite la methode swin du aquatic qui est sa classe mere telle facon il s'affiche *
"This aquatic animal is swimming "

Instruction 27 : le penguin herite la methode swim du aquatic qui est sa classe mere telle facon il s'affiche *
"This aquatic animal is swimming " car on a pas defini sa propre methode swim comme on fait dans la classe dolphin

Instruction 28 : on a modifié la methode swim en abstraite et aussi la classe Aquatic 

