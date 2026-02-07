package testRunners;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@Suite
@SelectPackages("demos")
public class DemoPackageRunner {

}
