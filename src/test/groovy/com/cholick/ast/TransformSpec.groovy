package com.cholick.ast

import com.cholick.main.Main
import spock.lang.Specification

import java.lang.reflect.Method

class TransformSpec extends Specification {

    // Won't work from IntelliJ
    def 'test compile'() {
        when:
        Main instance = new Main()
        Method added = instance.class.declaredMethods.find { it.name == 'added' }

        then:
        added
    }

    // Runs successfully from IntelliJ
    def 'test eval'() {
        given:
        String classString = '''
import com.cholick.ast.*

@Marker
class Test { }

new Test()
'''

        when:
        def instance = new GroovyShell().evaluate(classString)
        Method added = instance.class.declaredMethods.find { it.name == 'added' }

        then:
        added
    }

}
