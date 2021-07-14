import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Bag {
    private Item[] items;

    int findMaxSum(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > weight) {
            return findMaxSum(i - 1, weight);
        } else {
            return Math.max(findMaxSum(i - 1, weight),
                    findMaxSum(i - 1, weight - items[i].weight) + items[i].price);
        }
    }
}
