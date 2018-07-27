/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.samples.apps.topeka.model.quiz

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat

class FourQuarterQuizTest : AbsQuizTestCase<FourQuarterQuiz>() {

    override val quiz get() = FourQuarterQuiz(QUESTION, INT_ARRAY, STRING_ARRAY, false)

    override val expectedQuizType get() = QuizType.FOUR_QUARTER

    override fun quiz_answer_isCorrect() = assertThat(quiz.isAnswerCorrect(quiz.answer), `is`(true))

    override fun quiz_answer_correctlyStored() = assertThat(INT_ARRAY, `is`(quiz.answer))
}