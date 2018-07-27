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

data class FillBlankQuiz(
        override val question: String,
        override val answer: String,
        val start: String?, val end: String?,
        override var solved: Boolean
) : Quiz<String>(question, answer, solved) {

    override val stringAnswer get() = answer

    override val type get() = QuizType.FILL_BLANK

    override fun isAnswerCorrect(answer: String?): Boolean = this.answer
            .equals(answer, ignoreCase = true)
}
