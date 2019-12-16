package com.company.examples.quik_documentation;

import java.io.File;

public class QuickDocumentation {

    private void potentialNPEMethod() {
        File file = null;
        String s = file.getName();
    }
}
