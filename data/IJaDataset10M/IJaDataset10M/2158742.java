package cz.vse.gebz.validation;

import cz.vse.gebz.BazeZnalosti;

/**
 * A sample validator interface for {@link cz.vse.gebz.ObjektBaze}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ObjektBazeValidator {

    boolean validate();

    boolean validateBaze(BazeZnalosti value);
}