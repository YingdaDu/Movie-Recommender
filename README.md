# Movie Recommender System

## Overview
It is a movie recommender system based on Item Collaborative Filtering using Hadoop MapReduce in Java . 


## Data Source
Data comes from https://grouplens.org/datasets/movielens/, The project use 100,000 ratings from 1000 users on 1700 movies.

The raw data in the following format:
UserID, MovieID, Rating,Date


## Building Steps

* Divide data by user id
* Build co-occurrence matrix
* Normalize the co-occurrence matrix
* Build rating matrix
* Multiply co-occurrence matrix and rating matrix
* Generate recommendation list


## How to run

I created a hadoop cluster on Amazon Elastic MapReduce, which has 6 nodes, and ran my program on it.

```
$hadoop jar recommender.jar Driver /input dataDividedByUser/ coOccurrenceMatrix/ normalizedMatrix/ multiplication/ Sum/ recommender/
```

* args0: original dataset
* args1: output directory for DividerByUser job
* args2: output directory for coOccurrenceMatrixBuilder job
* args3: output directory for NormalizeCoOccurrenceMatrix job
* args4: output directory for MultiplicationMapperJoin job
* args5: output directory for MultiplicationSum job
* args6: output directory for RecommenderListGenerator job


