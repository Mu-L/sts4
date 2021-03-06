/*******************************************************************************
 * Copyright (c) 2017, 2021 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.vscode.commons.languageserver.util;

import java.util.List;

import org.eclipse.lsp4j.CodeLens;
import org.eclipse.lsp4j.CodeLensParams;
import org.eclipse.lsp4j.jsonrpc.CancelChecker;

@FunctionalInterface
public interface CodeLensHandler {

	List<? extends CodeLens> handle(CancelChecker cancelToken, CodeLensParams params);

}
