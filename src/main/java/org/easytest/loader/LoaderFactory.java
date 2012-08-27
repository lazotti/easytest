package org.easytest.loader;

import junit.framework.Assert;


/**
 * A factory class responsible for churning out Loader instances based on the type of File to load the data from.
 * @author Anuj kumar
 *
 */
public class LoaderFactory {
    
    /**
     * Return an instance of {@link Loader} based on the type of file or return null.
     * @param fileType the type of file
     * @return an instance of {@link Loader} or null if no loader is found.
     */
    public static Loader getLoader(LoaderType fileType){
        Loader loader = null;
        if(LoaderType.CSV.equals(fileType)){
            loader = new CSVDataLoader();
        }else{
            Assert.fail("The framework currently does not support the specified Loader type. " +
                "You can provide the custom Loader by choosing LoaderType.CUSTOM in TestData " +
                "annotation and providing your custom loader using DataLoader annotation." );
        }
        return loader;
    }

}
