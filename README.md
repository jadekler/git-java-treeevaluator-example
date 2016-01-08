# git-java-treeevaluator-example
[![Build Status](https://travis-ci.org/jadekler/git-java-treeevaluator-example.svg?branch=master)](https://travis-ci.org/jadekler/git-java-websiteskeleton) Example of a tree evaluator.

## Model

```
School
| 0..*
Subject (ex. Geometry, Art, French)
| 0..*
Levels Offered (ex. Regular, Honors, AP)
| 0..*
Possible Grades (ex. A+, B, C-, Pass, Fail)
```

## Data setup

> S = School

> U = Subject

> L = Level

> G = Grade


![](data_setup.png)