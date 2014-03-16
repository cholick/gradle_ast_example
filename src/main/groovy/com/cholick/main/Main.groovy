package com.cholick.main

import com.cholick.ast.Marker

@Marker
class Main {

    static void main(String[] args) {
        new Main().run()
    }

    def run() {
        println 'Running main'

        assert this.class.declaredMethods.find { it.name == 'added' }
        added()
    }

}
