package lt.dndfan.dndhelper.domain.dnd.translation.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterSubclass
import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterSubclassFactory
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait
import lt.dndfan.dndhelper.domain.dnd.translation.character.ISubclassTranslator

class SubclassTranslator : ISubclassTranslator {

    private val subclassFactory = CharacterSubclassFactory()

    override fun translate(args: Map<String, Any>,
                           allTraits : List<Trait>): CharacterSubclass {

        val traitList = ArrayList<Trait>()
        for(traitMap in args["features"] as ArrayList<Map<String,Any>>)
        {
            for(trait in allTraits)
            {
                if((traitMap["name"] as String) == trait.name)
                {
                    traitList.add(trait)
                    break
                }
            }
        }


        return subclassFactory.createCharacterSubclass(
                args["name"] as String,
                (args["desc"] as ArrayList<String>).joinToString(" "),
                (args["class"] as Map<String,Any>)["name"] as String,
                args["subclass_flavor"] as String,
                traitList
        )
    }
}