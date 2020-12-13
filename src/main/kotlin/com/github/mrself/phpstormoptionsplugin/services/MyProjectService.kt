package com.github.mrself.phpstormoptionsplugin.services

import com.intellij.openapi.project.Project
import com.github.mrself.phpstormoptionsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
