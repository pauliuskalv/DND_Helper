package lt.dndfan.dndhelper.util.collection.impl

import lt.dndfan.dndhelper.util.collection.IPair

class Pair<T1, T2>(override var key: T1,
                   override var value: T2) : IPair<T1, T2>