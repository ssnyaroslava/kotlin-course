package com.yaroslava.kotlincource.lesson8

fun main(){

    println(analizePhrase("Удача"))
    println("--------------------------")
    dateFromLog("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    println("--------------------------")
    dontShowNumber("4539 1488 0343 6467")
    println("--------------------------")
    email("username@example.com")
    println("--------------------------")
    println(fileName("C:/Пользователи/Документы/report.txt"))
    println("--------------------------")
    println(phfraze("Объектно-ориентированное программирование"))
    println("--------------------------")
    println(abbreviat("нечасто чувствую себя тупой, но у вас талант"))
    println("--------------------------")
    }

//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
// делая текст более ироничным или забавным.
//Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
//Примеры Тестовых Фраз:
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"
fun analizePhrase(phrase: String): String {

    var changablePhraze = ""


        if (phrase.contains("невозможно", ignoreCase = true)) {
        changablePhraze = phrase.replace("невозможно", "совершенно точно возможно, просто требует времени", ignoreCase = true)
    }

       if (phrase.startsWith("Я не уверен", ignoreCase = true)) {
        changablePhraze = "$phrase, но моя интуиция говорит об обратном"
    }

        if (phrase.contains("катастрофа", ignoreCase = true)) {
        changablePhraze = phrase.replace("катастрофа", "интересное событие", ignoreCase = true)
    }

        if (phrase.endsWith("без проблем", ignoreCase = true)) {
        changablePhraze = phrase.removeSuffix("без проблем") + " с парой интересных вызовов на пути"
    }

        if (phrase.split(" ").size == 1) {
        changablePhraze = "Иногда, ${phrase.lowercase()}, но не всегда"
    }

    return changablePhraze
}

//У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
fun dateFromLog(log: String){
    val dateTime = log.substringAfter("->").trim()
    val (date, time) = dateTime.split(" ")
    println("Дата: $date")
    println("Время: $time")
}

//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun dontShowNumber(cc: String) {
    val mask = "*".repeat(cc.length - 4)
    val cardMask = mask + cc.substring(14).trim()
    println(cardMask)
}

//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".
fun email(mailbox: String) {
    val mailboxModify = mailbox.replace("@", " [at] ").replace(".", " [dot] ")
    println(mailboxModify)
}

//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
fun fileName(path: String): String{
    return path.substringAfterLast('/')
}

//Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных
// букв слов (например, "ООП").
fun phfraze(phrase: String): String{
    var abbr = ""
    val words = phrase.split(" ", "-", "_")
    for (i in words) {
        if (i.isNotEmpty()) {
            abbr += i.first().uppercase()
        }
    }
    return abbr
}

//Написать метод, который преобразует строку из нескольких слов в строку,
// где каждое слово начинается с заглавной буквы а все остальные - строчные.
//(можно использовать такой же подход как в задании 5, но накапливать не первые буквы а целиком слова,
//составленные из первой буквы с uppercase и оставшейся части слова)
fun abbreviat(phrase: String): String {
    var abbr = ""
    val words = phrase.split(" ", "-", "_")
    for (i in words) {
        if (i.isNotEmpty()) {
            val capitalizedWord = i.first().uppercase() + i.substring(1).lowercase()
            abbr += "$capitalizedWord "
        }
    }
    return abbr.trim()
}