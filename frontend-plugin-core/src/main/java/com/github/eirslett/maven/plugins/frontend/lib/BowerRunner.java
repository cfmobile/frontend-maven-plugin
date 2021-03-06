package com.github.eirslett.maven.plugins.frontend.lib;

import java.io.File;
import java.util.ArrayList;

public interface BowerRunner {

    public void execute(String args) throws TaskRunnerException;
}

final class DefaultBowerRunner extends WorkingDirTaskExecutor implements BowerRunner {

    private static final String TASK_NAME = "bower";
    private static final String TASK_LOCATION = "/node_modules/bower/bin/bower";

    DefaultBowerRunner(Platform platform, File nodeInstallDirectory, File workingDirectory) {
        super(TASK_NAME, TASK_LOCATION, nodeInstallDirectory, workingDirectory, platform, new ArrayList<String>());
    }
}
