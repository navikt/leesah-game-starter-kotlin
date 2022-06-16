package no.nav

import no.nav.quizrapid.*
import no.nav.rapid.Assessment
import no.nav.rapid.Question

class QuizApplication(teamName: String): QuizParticipant(teamName) {

    override fun handle(question: Question) {
        println(question)
    }

    override fun handle(assessment: Assessment) {
        println(assessment)
    }
}