/*******************************************************************************
 * Copyright 2015
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

/**
 *
 */
package de.tudarmstadt.ukp.dkpro.wsd.resource;

import java.util.Map;

import de.tudarmstadt.ukp.dkpro.wsd.algorithm.WSDAlgorithmContextBasic;
import de.tudarmstadt.ukp.dkpro.wsd.si.SenseInventoryException;

/**
 * A resource wrapping algorithms of type {@link WSDAlgorithmContextBasic}
 *
 * @author <a href="mailto:miller@ukp.informatik.tu-darmstadt.de">Tristan Miller</a>
 *
 */
public class WSDResourceContextBasic
	extends WSDResourceBasic
	implements WSDAlgorithmContextBasic
{

	@Override
	public Map<String, Double> getDisambiguation(String sod, String context)
		throws SenseInventoryException
	{
		return ((WSDAlgorithmContextBasic) wsdAlgorithm).getDisambiguation(sod,
				context);
	}

}
