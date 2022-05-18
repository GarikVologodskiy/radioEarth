/*Создайте приложение для проверки ответа на вопрос какой формы Земля с выбором ответов.
Реализуйте для этого приложения следующий интерфейс:

textView с формулировкой вопроса и id tvQuestion.
radioGroup с id rgAnswers c четырьмя вариантами ответов
(диск, шар, эллипсоид, куб, id rbDisk, rbSphere, rbEllipsoid, rbCube соответственно).
button - кнопка для ответа, id butAnswer.
textView с результатом ответа ("Правильно!" / "Неправильно!") и id tvAnswer, изначально пустой.
В случае, если ответ не выбран, при нажатии кнопки butAnswer должен вывестись ответ "Неправильно!".
*/

package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butAnswer.setOnClickListener {
            //Own rb listener
            /*rgAnswers.setOnCheckedChangeListener { _, checkedId -> findViewById<RadioButton>(checkedId)?.apply {
                tvAnswer.text = "Правильно!"
            } }*/
            val id: Int = rgAnswers.checkedRadioButtonId

            if (id == rbSphere.id) {
                tvAnswer.text = "Правильно!"
            } else {
                tvAnswer.text = "Неправильно!"
            }
        }
    }
}
