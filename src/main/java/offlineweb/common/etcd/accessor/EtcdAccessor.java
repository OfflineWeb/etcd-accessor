/*
 * The MIT License
 *
 *   Copyright 2017 papa.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 *
 */

package offlineweb.common.etcd.accessor;

import offlineweb.common.logger.annotations.Loggable;
import offlineweb.common.restconnector.RESTClient;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static offlineweb.common.etcd.accessor.util.EtcdConfig.*;

/**
 * @author papa
 * created on 8/3/17.
 */

@Loggable
public class EtcdAccessor {

    private void createDir(String dirName) throws IOException {
        Map<String, String> reqBody = new HashMap<>();
        reqBody.put("dir", "true");
        Map etcdResult = RESTClient.put(getEtcdURL(),
            Arrays.asList("v2", "keys", dirName),
            null,
            reqBody,
            null,
            RESTClient.REQUEST_BODY.KEY_VALUE
            );
    }

    private void getDir(String dirName) {
        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("dir", "true");

        Map<String, String> dirMap = new HashMap<>();
        dirMap.put("dir", "true");
    }
}
