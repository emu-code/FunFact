package com.emu.funfact

object DummyData {
    val facts = listOf<FactModel>(
        FactModel("Kotlin",
        R.drawable.kotlin, "Kotlin has 100% interoperability with Java."),

            FactModel("Java",
                    R.drawable.java,
                    "The original name for Java was Oak. " +
                            "It was eventually changed to Java by Sun's marketing department" +
                            " when Sun lawyers found that there was already a computer company registered as Oak"
            ),
            FactModel("PHP",
                    R.drawable.php_logo,
                    "Over 244+ Million Websites use PHP."
            ),
            FactModel("Python",
                    R.drawable.python,
                    "\n" +
                            "The language’s name isn’t about snakes, " +
                            "but about the popular British comedy troupe Monty Python (from the 1970s)."
            ),
            FactModel("Javascript",
                    R.drawable.js_logo,
                    "\n" +
                            "Despite the fact that there are similarities between JavaScript and Java, including language name, " +
                            "respective standard libraries and syntax," +
                            " these two languages are distinct and differ significantly in design."
            )

    )
}