/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

 /*
  Part of the Processing project - http://processing.org

  Copyright (c) 2018 Andres Colubri

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation, version 2.1.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General
  Public License along with this library; if not, write to the
  Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA  02111-1307  USA
 */
package processing.lwjgl;

import java.util.Optional;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PSurface;
import processing.opengl.PGL;
import processing.opengl.PGraphics2D;
import processing.opengl.PGraphicsOpenGL;

public class PGraphicsLWJGL2D extends PGraphics2D {
    
    @Override
    protected PGL createPGL(PGraphicsOpenGL pg) {
        return new PLWJGL(pg);
    }

    @Override
    public PSurface createSurface() {
        return surface = new PSurfaceLWJGL(this);
    }
    
    public static class GraphicsFactory implements PApplet.GraphicsFactory {

        @Override
        public Optional<PGraphics> createGraphics(PApplet parent, String type) {
            if (type.equals(PConstants.P2D) || type.equals(PGraphicsLWJGL2D.class.getName())) {
                return Optional.of(new PGraphicsLWJGL2D());
            } else {
                return Optional.empty();
            }
        }
        
    }
    
}
