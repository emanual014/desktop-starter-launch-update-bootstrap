package desktop.starter.model;

import desktop.starter.util.model.ArgumentType;
import desktop.starter.util.model.download.Repo;
import lombok.Data;
import java.util.List;
import java.util.Map;

/**
 * Updating for every version.
 */
@Data
//todo put config file in git and use from git (RAW button) ,parse with gson like one object
//todo create real example to run test.jar and add new module with test and description
//todo added this way to config arguments , in this case we can insert in app. -Djava.library.path=${natives_directory}
public class AppConfig {
    private String comment = "Config file for desktop-starter example";
    private String appName;
    private double appVersion;
    private String mainClass;
    private Map<ArgumentType,List<String>> arguments;
    /**
     * images and other files are used an app
     */
    //!
    private Repo appFileRepo;    
    private Repo appResources;
    //used for -cp
    private Repo appDependencies;
    //!
    private Repo javaRepo;
}

