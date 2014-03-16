package com.cholick.ast

import com.cholick.main.Main
import spock.lang.Specification

import java.lang.reflect.Method

class MainSpec extends Specification {

    def 'transform adds to main'() {
        when:
        Main instance = new Main()
        Method added = instance.class.declaredMethods.find { it.name == 'added' }

        then:
        added
    }

}
