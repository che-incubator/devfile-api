

# V1alpha2DevWorkspaceSpecTemplateEvents

Bindings of commands to events. Each command is referred-to by its name.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postStart** | **List&lt;String&gt;** | IDs of commands that should be executed after the devworkspace is completely started. In the case of Che-Theia, these commands should be executed after all plugins and extensions have started, including project cloning. This means that those commands are not triggered until the user opens the IDE in his browser. |  [optional]
**postStop** | **List&lt;String&gt;** | IDs of commands that should be executed after stopping the devworkspace. |  [optional]
**preStart** | **List&lt;String&gt;** | IDs of commands that should be executed before the devworkspace start. Kubernetes-wise, these commands would typically be executed in init containers of the devworkspace POD. |  [optional]
**preStop** | **List&lt;String&gt;** | IDs of commands that should be executed before stopping the devworkspace. |  [optional]



