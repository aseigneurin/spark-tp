# Travaux pratiques sur Spark

## Préparation

Télécharger et installer Spark :

    $ scripts/get-spark.sh

Télécharger les données

    $ scripts/get-paris-arbresalignementparis2010.sh
    $ scripts/get-wikipedia-pagecounts.sh

## Lancement de Spark

Lancement du Master :

    $ spark-1.2.0-bin-hadoop2.4/sbin/start-master.sh

Ouvrir le fichier de log indiqué sur la console et extraire :

- l'URL de l'interface Web : http://your.host.name:8080
- l'URL de l'interface Web : spark://your.host.name:7077

Lancement d'un slave :

    $ spark-1.2.0-bin-hadoop2.4/bin/spark-class org.apache.spark.deploy.worker.Worker spark://your.host.name:7077 --cores 2 --memory 2G

Packaging et lancement d'une application :

    $ mvn clean package
    $ spark-1.2.0-bin-hadoop2.4/bin/spark-submit --master spark://your.host.name:7077 --class com.yourname.spark.MainClass --deploy-mode cluster target/spark-tp-0.0.1-SNAPSHOT.jar