/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prototype.advancedprinter.graphic.render;

import br.com.prototype.advancedprinter.event.EventTypeEnum;
import br.com.prototype.advancedprinter.graphic.document.AbstractComponentPage;
import br.com.prototype.advancedprinter.graphic.render.annotation.EventRenderType;

/**
 *
 * @author Ronaldo Totini
 */
@EventRenderType(event = EventTypeEnum.BORDER_SELECTION_S)
public class BorderSouthEventRender implements ComponentPageRender {

    @Override
    public void render(AbstractComponentPage component, int x, int y, int initX, int initY) {

       
            if (y > initY) {
                component.setHeight(component.getHeight() + (y - initY));
            } else if (y < initY) {
                component.setHeight(component.getHeight() - (initY - y));
            }
       
    }

}
