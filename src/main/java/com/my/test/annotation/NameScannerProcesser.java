package com.my.test.annotation;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * @author:shawn
 * @date 2020/10/19 15:30
 */
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class NameScannerProcesser extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!roundEnv.processingOver()){
            Set<? extends Element> elementsAnnotations = roundEnv.getElementsAnnotatedWith(NameScanner.class);
            for (Element elementsAnnotation : elementsAnnotations) {
                String name = elementsAnnotation.getSimpleName().toString();
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"Element name"+name);
            }
        }
        return false;
    }
}
