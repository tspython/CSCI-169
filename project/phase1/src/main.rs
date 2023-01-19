fn binary_search(A: &[i32], n: i32, T: i32) -> i32 {
    let mut L = 0;
    let mut R = n - 1;
    while L <= R {
        let m = (L + R) / 2;
        if A[m as usize] < T {
            L = m + 1;
        } else if A[m as usize] > T {
            R = m - 1;
        } else {
            return m;
        }
    }
    return -1;
}

fn main() {
    let A = [1, 3, 4, 6, 8, 9, 11];
    let n = A.len() as i32;
    let T = 8;
    let result = binary_search(&A, n, T);

    if result != -1 {
        println!("Element {} found at index {}", T, result);
    } else {
        println!("Element {} not found", T);
    }
}
