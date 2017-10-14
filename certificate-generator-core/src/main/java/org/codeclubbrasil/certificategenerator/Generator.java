package org.codeclubbrasil.certificategenerator;

import org.codeclubbrasil.certificategenerator.domain.CertificateTemplate;
import org.codeclubbrasil.certificategenerator.domain.CodeClubClass;
import org.codeclubbrasil.certificategenerator.exception.GeneratorException;
import org.codeclubbrasil.certificategenerator.exception.InvalidClassException;
import org.codeclubbrasil.certificategenerator.exception.InvalidTemplateException;

public interface Generator {

	String generate(CertificateTemplate template, CodeClubClass codeClass)
			throws GeneratorException, InvalidClassException, InvalidTemplateException;

}
