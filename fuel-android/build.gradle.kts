dependencies {
    api(project(Fuel.name))

    testImplementation(project(Fuel.Test.name))
    testImplementation(RoboElectric.dependency)
    testImplementation(project(Fuel.Json.name))
}
