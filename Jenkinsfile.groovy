

node {
    // Mark the code checkout 'stage'....
    stage 'Checkout'

    // Get some code from a GitHub repository
    git url: 'file://D:\\work\\go-projects\\portfolio-management'

    // Mark the code build 'stage'....
    stage 'commit'
    build "portfolio-management-init"
    stage 'assemble'
    build "portfolio-management-assemble"
}