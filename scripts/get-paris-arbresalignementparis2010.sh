#!/bin/bash -e

mkdir -p ../data/paris-arbresalignementparis2010 && cd $_

curl http://opendata.paris.fr/explore/dataset/arbresalignementparis2010/download/?format=csv > arbresalignementparis2010.csv
