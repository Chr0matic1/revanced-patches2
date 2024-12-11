group = "app.revanced"

patches {
    about {
        name = "ReVanced Patches template"
        description = "Patches template for ReVanced"
        source = "git@github.com:Chr0matic1/revanced-patches2.git"
        author = "Example"
        contact = "contact@example.url"
        website = "https://example.url"
        license = "GNU General Public License v3.0"
    }
}


dependencies {
    // Used by JsonGenerator.
    implementation(libs.gson)
    // Required due to smali, or build fails. Can be removed once smali is bumped.
    implementation(libs.guava)
}

kotlin {
    compilerOptions {
        freeCompilerArgs = listOf("-Xcontext-receivers")
    }
}
