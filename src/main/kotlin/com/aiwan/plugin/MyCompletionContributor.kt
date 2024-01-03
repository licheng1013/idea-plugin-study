package com.aiwan.plugin

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.util.ProcessingContext

class MyCompletionContributor : CompletionContributor() {

    init {
        extend(
            CompletionType.BASIC, psiElement(),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext,
                                            resultSet: CompletionResultSet
                ) {
                    resultSet.addElement(LookupElementBuilder.create("Hello"))
                    resultSet.addElement(LookupElementBuilder.create("World"))
                }
            }
        )
    }
}