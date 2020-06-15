/* Write function describeList which tells if the list is empty
or contains only one element or more.
 */

package kyu7;

import java.util.List;

class DescribeAList {
    static String describeList(List<Object> list) {
        return list.isEmpty() ? "empty" : list.size() > 1 ? "longer" : "singleton";
    }
}