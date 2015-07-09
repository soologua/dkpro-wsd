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

package de.tudarmstadt.ukp.dkpro.wsd.algorithm;

import java.util.Collection;
import java.util.Map;

import de.tudarmstadt.ukp.dkpro.wsd.si.SenseInventoryException;

/**
 * An interface for word sense disambiguation algorithms which disambiguate an
 * entire collection of subjects at once. The algorithms take as input a
 * collection of subjects of disambiguation (typically lemmas) represented by
 * {@link String}s. Each subject is assigned a mapping of sense IDs to
 * confidence values.
 *
 * @author <a href="mailto:erbs@ukp.informatik.tu-darmstadt.de">Nicolai Erbs</a>
 *
 */
public interface WSDAlgorithmCollectiveBasic
	extends WSDAlgorithm
{
	public Map<String, Map<String, Double>> getDisambiguation(
			Collection<String> sods)
		throws SenseInventoryException;

}
