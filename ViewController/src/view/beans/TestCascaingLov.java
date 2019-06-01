package view.beans;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.binding.DCBindingContainer;

import view.util.WABEAN;

public class TestCascaingLov {
    public TestCascaingLov() {
    }

    public void changeRegion(ValueChangeEvent valueChangeEvent) {// on first level of cascading
        WABEAN mybean = new WABEAN();
        mybean.AccessAttribute("Country").setInputValue(null);// second level attribunte
        // makes also the third level attribute to null 
       // mybean.AccessAttribute("City").setInputValue(null);// thierd level no need to make it null
    }
}
