package com.github.itohiro73.intellijpluginkotlinsample120.services

import com.github.itohiro73.intellijpluginkotlinsample120.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
